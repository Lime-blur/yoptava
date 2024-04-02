import com.itranswarp.compiler.JavaStringCompiler;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import cache.CacheUtils;
import core.StringUtils;
import files.FileUtils;
import files.YoptavaFileUtils;
import settings.YoptavaSettings;

public class Main {

    private static final Map<String, String> contents = new HashMap<>();
    private static final Map<String, Map<String, byte[]>> compileResults = new HashMap<>();

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        JavaStringCompiler compiler = new JavaStringCompiler();
        prepareCache();
        loadClasses();
        compileClasses(compiler);
        loadClasses(compiler);
        clearCache();
    }

    private static void prepareCache() throws IOException {
        CacheUtils.refreshCacheDirectory();
        YoptavaFileUtils.createSourcesInCacheDirectory();
        String sourcesDirectory = YoptavaFileUtils.getSourcesDirectory();
        for (String file : FileUtils.listShortFilesPath(sourcesDirectory)) {
            YoptavaFileUtils.putYoptavaInCache(file);
        }
    }

    private static void clearCache() {
        CacheUtils.clearCacheDirectory();
    }

    private static void loadClasses() throws IOException {
        String sourcesDirectory = YoptavaFileUtils.getSourcesDirectory();
        for (String file : FileUtils.listShortFilesPath(sourcesDirectory)) {
            String javaFile = YoptavaFileUtils.getCachedYoptavaName(file);
            contents.put(
                javaFile, YoptavaFileUtils.readYoptavaFromCache(javaFile)
            );
        }
    }

    private static void compileClasses(JavaStringCompiler compiler) throws IOException {
        for (Map.Entry<String, String> entry : contents.entrySet()) {
            compileResults.put(
                entry.getKey(),
                compiler.compile(entry.getKey(), entry.getValue())
            );
        }
    }

    private static void loadClasses(JavaStringCompiler compiler) throws IOException, ClassNotFoundException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> mainClass = null;
        for (Map.Entry<String, Map<String, byte[]>> entry : compileResults.entrySet()) {
            String className = entry.getKey().replace(FileUtils.JAVA_EXTENSION, StringUtils.EMPTY_STRING);
            Class<?> clazz = compiler.loadClass(className, entry.getValue());
            if (className.equals(YoptavaSettings.MAIN_CLASS_NAME)) mainClass = clazz;
        }
        runMainClass(mainClass);
    }

    private static void runMainClass(Class<?> mainClass) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        if (mainClass == null) return;
        Method multiplyStaticMethod = mainClass.getDeclaredMethod(YoptavaSettings.MAIN_CLASS_LOAD_METHOD);
        multiplyStaticMethod.invoke(new Object());
    }
}
