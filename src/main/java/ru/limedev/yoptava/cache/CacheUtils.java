package ru.limedev.yoptava.cache;

import ru.limedev.yoptava.files.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class CacheUtils {

    public static final String CACHE_DIRECTORY = ".cache";
    public static final String CLASSES_DIRECTORY = ".classes";

    public static Path getCacheDirectory() {
        return FileUtils.getAbsolutePath(CACHE_DIRECTORY);
    }

    public static Path getClassesDirectory() {
        return FileUtils.getAbsolutePath(CLASSES_DIRECTORY);
    }

    public static void refreshCacheDirectory() throws IOException {
        clearCacheDirectory();
        Files.createDirectory(getCacheDirectory());
    }

    public static void refreshClassesDirectory() throws IOException {
        clearClassesDirectory();
        Files.createDirectory(getClassesDirectory());
    }

    public static void clearCacheDirectory() {
        FileUtils.deleteDirectory(getCacheDirectory().toFile());
    }

    public static void clearClassesDirectory() {
        FileUtils.deleteDirectory(getClassesDirectory().toFile());
    }

    public static void refreshCache() throws IOException {
        refreshCacheDirectory();
        refreshClassesDirectory();
    }

    public static void clearCache() {
        clearCacheDirectory();
        clearClassesDirectory();
    }
}
