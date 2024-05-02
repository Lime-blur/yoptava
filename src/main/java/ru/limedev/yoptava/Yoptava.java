package ru.limedev.yoptava;

import com.itranswarp.compiler.JavaStringCompiler;
import ru.limedev.yoptava.cache.CacheUtils;
import ru.limedev.yoptava.core.StringUtils;
import ru.limedev.yoptava.files.FileUtils;
import ru.limedev.yoptava.files.YoptavaFileUtils;
import ru.limedev.yoptava.settings.GoptavaSettings;
import ru.limedev.yoptava.settings.LeptavaSettings;
import ru.limedev.yoptava.settings.RuptavaSettings;
import ru.limedev.yoptava.settings.abstraction.YoptavaSettings;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class Yoptava {

    private static final Map<String, String> contents = new HashMap<>();
    private static final Map<String, Map<String, byte[]>> compileResults = new HashMap<>();

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
