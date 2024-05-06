package ru.limedev.yoptava.files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

import ru.limedev.yoptava.cache.CacheUtils;
import ru.limedev.yoptava.utils.StringUtils;
import ru.limedev.yoptava.parser.YoptavaParser;
import ru.limedev.yoptava.settings.abstraction.YoptavaSettings;

public final class YoptavaFileUtils {

    public static String getCachedYoptavaShortPath(String file, YoptavaSettings settings) {
        String shortPath = FileUtils.getShortFilePath(file, settings);
        return shortPath.replace(settings.getLanguage().getExtension(), FileUtils.JAVA_EXTENSION);
    }

    public static void convertCachedYoptava(String javaFile, YoptavaSettings settings) throws IOException {
        Path yoptavaPath = getYoptavaPathFromCache(javaFile, settings);
        byte[] encoded = Files.readAllBytes(yoptavaPath);
        String content = new String(encoded, Charset.defaultCharset());
        String converted = YoptavaParser.parseAndConvert(content, settings);
        Path file = Paths.get(yoptavaPath.toUri());
        Files.write(file, Collections.singleton(converted), StandardCharsets.UTF_8);
    }

    public static void putYoptavaInCache(String file, YoptavaSettings settings) throws IOException {
        String javaFile = getCachedYoptavaName(file, settings);
        Path targetPath = getYoptavaPathFromCache(file, settings);
        createParentDirectories(targetPath);
        Path copiedPath = Files.copy(getYoptavaPath(file, settings), targetPath);
        FileUtils.renameFile(copiedPath, javaFile);
    }

    public static void createSourcesInCacheDirectory(YoptavaSettings settings) throws IOException {
        Files.createDirectory(getSourcesInCacheDirectoryPath(settings));
    }

    public static String getSourcesDirectory(YoptavaSettings settings) {
        String sourcesDirectory = StringUtils.EMPTY_STRING;
        if (!settings.getSourcesDirectory().isEmpty()) sourcesDirectory = settings.getSourcesDirectory();
        return sourcesDirectory;
    }

    private static Path getYoptavaPath(String file, YoptavaSettings settings) {
        String sourcesDirectory = getSourcesDirectory(settings);
        if (file != null) sourcesDirectory += FileUtils.fileSeparator + file;
        return FileUtils.getAbsolutePath(sourcesDirectory);
    }

    private static Path getYoptavaPathFromCache(String file, YoptavaSettings settings) {
        String cachedFile = getSourcesInCacheDirectoryPath(settings) + FileUtils.fileSeparator + file;
        return FileUtils.getAbsolutePath(cachedFile);
    }

    private static Path getSourcesInCacheDirectoryPath(YoptavaSettings settings) {
        return FileUtils.getAbsolutePath(getSourcesInCacheDirectory(settings));
    }

    private static String getSourcesInCacheDirectory(YoptavaSettings settings) {
        String sourcesDirectory = CacheUtils.CACHE_DIRECTORY;
        boolean isSourcesDirectoryEmpty = settings.getSourcesDirectory().isEmpty();
        if (!isSourcesDirectoryEmpty) sourcesDirectory += FileUtils.fileSeparator + settings.getSourcesDirectory();
        return sourcesDirectory;
    }

    private static String getCachedYoptavaName(String file, YoptavaSettings settings) {
        File f = new File(file);
        return f.getName().replace(settings.getLanguage().getExtension(), FileUtils.JAVA_EXTENSION);
    }

    private static void createParentDirectories(Path path) throws IOException {
        Path parent = path.getParent();
        if (parent == null) return;
        if (Files.notExists(parent)) Files.createDirectories(parent);
    }
}
