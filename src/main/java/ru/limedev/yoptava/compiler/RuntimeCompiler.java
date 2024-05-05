package ru.limedev.yoptava.compiler;

import ru.limedev.yoptava.compiler.exception.CompilationException;
import ru.limedev.yoptava.files.FileUtils;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public final class RuntimeCompiler {

    private File classesDir;
    private File sourceDir;

    public void setClassesDir(Path classesDir) {
        this.classesDir = classesDir.toFile();
    }

    public void setSourceDir(Path sourceDir) {
        this.sourceDir = sourceDir.toFile();
    }

    public void setClassesDir(File classesDir) {
        this.classesDir = classesDir;
    }

    public void setSourceDir(File sourceDir) {
        this.sourceDir = sourceDir;
    }

    public void setClassesDir(String classesDir) {
        this.classesDir = new File(classesDir);
    }

    public void setSourceDir(String sourceDir) {
        this.sourceDir = new File(sourceDir);
    }

    public void loadClassesFromCompiledDirectory() throws CompilationException {
        try {
            new URLClassLoader(new URL[] { classesDir.toURI().toURL() });
        } catch (Exception e) {
            throw new CompilationException(e);
        }
    }

    public Class<?> getClassFromCompiledDirectory(String className) throws CompilationException {
        try {
            URL url = classesDir.toURI().toURL();
            URL[] urls = new URL[] { url };
            ClassLoader loader = new URLClassLoader(urls);
            return loader.loadClass(className);
        } catch (Exception e) {
            throw new CompilationException(e);
        }
    }

    public void compile() throws CompilationException {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
        StandardJavaFileManager fileManager = getFileManager(compiler, diagnostics);
        List<JavaFileObject> javaObjects = getJavaObjects(fileManager);
        Iterable<String> compilationOptions = getCompilationOptions();
        CompilationTask compilerTask = compiler.getTask(null, fileManager, diagnostics, compilationOptions, null, javaObjects);
        executeCompilerTask(compilerTask, diagnostics);
    }

    private StandardJavaFileManager getFileManager(
        JavaCompiler compiler,
        DiagnosticCollector<JavaFileObject> diagnostics
    ) {
        return compiler.getStandardFileManager(diagnostics, Locale.getDefault(), null);
    }

    private Iterable<String> getCompilationOptions() {
        String[] options = new String[] { "-d", classesDir.getAbsolutePath() };
        return Arrays.asList(options);
    }

    private List<JavaFileObject> getJavaObjects(StandardJavaFileManager fileManager) throws CompilationException {
        List<JavaFileObject> javaObjects = scanRecursivelyForJavaObjects(sourceDir, fileManager);
        if (javaObjects.isEmpty()) {
            throw new CompilationException("There are no source files to compile in " + sourceDir.getAbsolutePath());
        }
        return javaObjects;
    }

    private void executeCompilerTask(
        CompilationTask compilerTask,
        DiagnosticCollector<JavaFileObject> diagnostics
    ) throws CompilationException {
        Boolean result = compilerTask.call();
        if (result == null || !result) {
            for (Diagnostic<?> diagnostic : diagnostics.getDiagnostics()) {
                System.err.format("Error on line %d in %s", diagnostic.getLineNumber(), diagnostic);
            }
            throw new CompilationException("Compilation failed.");
        }
    }

    private List<JavaFileObject> scanRecursivelyForJavaObjects(File dir, StandardJavaFileManager fileManager) {
        List<JavaFileObject> javaObjects = new LinkedList<>();
        File[] files = dir.listFiles();
        if (files == null) return javaObjects;
        for (File file : files) {
            if (file.isDirectory()) {
                javaObjects.addAll(scanRecursivelyForJavaObjects(file, fileManager));
            } else if (file.isFile() && FileUtils.isJavaExtension(file)) {
                javaObjects.add(readJavaObject(file, fileManager));
            }
        }
        return javaObjects;
    }

    private JavaFileObject readJavaObject(File file, StandardJavaFileManager fileManager) {
        Iterable<? extends JavaFileObject> javaFileObjects = fileManager.getJavaFileObjects(file);
        Iterator<? extends JavaFileObject> it = javaFileObjects.iterator();
        if (it.hasNext()) return it.next();
        throw new RuntimeException("Could not load " + file.getAbsolutePath() + " java file object.");
    }
}
