package files;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

import cache.CacheUtils;
import core.StringUtils;
import parser.YoptavaParser;
import settings.settings.abstraction.YoptavaSettings;

public final class YoptavaFileUtils {

    public static String getCachedYoptavaName(String file, YoptavaSettings settings) {
        return file.replace(settings.getLanguageType().extension, FileUtils.JAVA_EXTENSION);
    }

    public static String readYoptavaFromCache(String javaFile, YoptavaSettings settings) throws IOException {
        Path yoptavaPath = getYoptavaPathFromCache(javaFile, settings);
        byte[] encoded = Files.readAllBytes(yoptavaPath);
        String content = new String(encoded, Charset.defaultCharset());
        return YoptavaParser.parseAndConvert(content, settings);
    }

    public static void putYoptavaInCache(String file, YoptavaSettings settings) throws IOException {
        String javaFile = getCachedYoptavaName(file, settings);
        Path targetPath = getYoptavaPathFromCache(file, settings);
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
}
