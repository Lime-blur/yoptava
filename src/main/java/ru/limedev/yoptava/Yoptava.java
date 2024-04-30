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
import settings.settings.DefaultSettings;
import settings.settings.abstraction.YoptavaSettings;

public final class Yoptava {

    private static final Map<String, String> contents = new HashMap<>();
    private static final Map<String, Map<String, byte[]>> compileResults = new HashMap<>();

    public static void init() {
        YoptavaSettings settings = new DefaultSettings();
        init(settings);
    }

    public static void init(YoptavaSettings settings) {
        JavaStringCompiler compiler = new JavaStringCompiler();
        try {
            prepareCache(settings);
            loadClasses(settings);
            compileClasses(compiler);
            loadClasses(compiler, settings);
        } catch (Exception e) {
            e.printStackTrace();
        }
        clearCache();
    }

    private static void prepareCache(YoptavaSettings settings) throws IOException {
        CacheUtils.refreshCacheDirectory();
        YoptavaFileUtils.createSourcesInCacheDirectory(settings);
        String sourcesDirectory = YoptavaFileUtils.getSourcesDirectory(settings);
        for (String file : FileUtils.listShortFilesPath(sourcesDirectory, settings)) {
            YoptavaFileUtils.putYoptavaInCache(file, settings);
        }
    }

    private static void clearCache() {
        CacheUtils.clearCacheDirectory();
    }

    private static void loadClasses(YoptavaSettings settings) throws IOException {
        String sourcesDirectory = YoptavaFileUtils.getSourcesDirectory(settings);
        for (String file : FileUtils.listShortFilesPath(sourcesDirectory, settings)) {
            String javaFile = YoptavaFileUtils.getCachedYoptavaName(file, settings);
            contents.put(
                javaFile, YoptavaFileUtils.readYoptavaFromCache(javaFile, settings)
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

    private static void loadClasses(JavaStringCompiler compiler, YoptavaSettings settings) throws
            IOException,
            ClassNotFoundException,
            IllegalAccessException,
            NoSuchMethodException,
            InvocationTargetException {
        Class<?> mainClass = null;
        for (Map.Entry<String, Map<String, byte[]>> entry : compileResults.entrySet()) {
            String className = entry.getKey().replace(FileUtils.JAVA_EXTENSION, StringUtils.EMPTY_STRING);
            Class<?> clazz = compiler.loadClass(className, entry.getValue());
            if (className.equals(settings.getMainClassName())) mainClass = clazz;
        }
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
