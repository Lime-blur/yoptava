package ru.limedev.yoptava;

import ru.limedev.yoptava.cache.CacheUtils;
import ru.limedev.yoptava.compiler.RuntimeCompiler;
import ru.limedev.yoptava.compiler.exception.CompilationException;
import ru.limedev.yoptava.files.FileUtils;
import ru.limedev.yoptava.files.YoptavaFileUtils;
import ru.limedev.yoptava.settings.GoptavaSettings;
import ru.limedev.yoptava.settings.LeptavaSettings;
import ru.limedev.yoptava.settings.RuptavaSettings;
import ru.limedev.yoptava.settings.BelptavaSettings;
import ru.limedev.yoptava.settings.abstraction.YoptavaSettings;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class Yoptava {

    /**
     * Initializes Goptava classes with default settings.
     */
    public static void initGoptava() {
        YoptavaSettings settings = new GoptavaSettings();
        init(settings);
    }

    /**
     * Initializes Goptava classes with default settings.
     */
    public static void initLeptava() {
        YoptavaSettings settings = new LeptavaSettings();
        init(settings);
    }

    /**
     * Initializes Belptava classes with default settings.
     */
    public static void initBelptava() {
        YoptavaSettings settings = new BelptavaSettings();
        init(settings);
    }

    /**
     * Initializes Ruptava classes with default settings.
     */
    public static void initRuptava() {
        YoptavaSettings settings = new RuptavaSettings();
        init(settings);
    }

    /**
     * Initializes Yoptava classes with {@link YoptavaSettings}.
     */
    public static void init(YoptavaSettings settings) {
        RuntimeCompiler compiler = new RuntimeCompiler();
        try {
            prepareCache(settings);
            convertClasses(settings);
            compileClasses(compiler);
            runMainClass(compiler, settings);
        } catch (Exception e) {
            e.printStackTrace();
        }
        clearCache();
    }

    private static void prepareCache(YoptavaSettings settings) throws IOException {
        CacheUtils.refreshCache();
        YoptavaFileUtils.createSourcesInCacheDirectory(settings);
        String sourcesDirectory = YoptavaFileUtils.getSourcesDirectory(settings);
        for (String file : FileUtils.listShortFilesPath(sourcesDirectory, settings)) {
            YoptavaFileUtils.putYoptavaInCache(file, settings);
        }
    }

    private static void clearCache() {
        CacheUtils.clearCache();
    }

    private static void convertClasses(YoptavaSettings settings) throws IOException {
        String sourcesDirectory = YoptavaFileUtils.getSourcesDirectory(settings);
        for (String file : FileUtils.listFilesPath(sourcesDirectory)) {
            String javaFile = YoptavaFileUtils.getCachedYoptavaShortPath(file, settings);
            YoptavaFileUtils.convertCachedYoptava(javaFile, settings);
        }
    }

    private static void compileClasses(RuntimeCompiler compiler) throws CompilationException {
        compiler.setClassesDir(CacheUtils.CLASSES_DIRECTORY);
        compiler.setSourceDir(CacheUtils.getCacheDirectory());
        compiler.compile();
        compiler.loadClassesFromCompiledDirectory();
    }

    private static void runMainClass(RuntimeCompiler compiler, YoptavaSettings settings) throws
            CompilationException,
            InvocationTargetException,
            IllegalAccessException,
            NoSuchMethodException {
        String mainClassName = settings.getMainClassName();
        Class<?> mainClass = compiler.getClassFromCompiledDirectory(mainClassName);
        runMainClass(mainClass, settings);
    }

    private static void runMainClass(Class<?> mainClass, YoptavaSettings settings) throws
            InvocationTargetException,
            IllegalAccessException,
            NoSuchMethodException {
        if (mainClass == null) return;
        Method multiplyStaticMethod = mainClass.getDeclaredMethod(settings.getMainClassLoadMethod());
        multiplyStaticMethod.invoke(new Object());
    }
}
