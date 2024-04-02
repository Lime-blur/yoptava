package files;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

import cache.CacheUtils;
import core.StringUtils;
import parser.YoptavaParser;

public class YoptavaFileUtils {

    public static String getCachedYoptavaName(String file) {
        return file.replace(YoptavaFiles.FILE_EXTENSION, FileUtils.JAVA_EXTENSION);
    }

    public static String readYoptavaFromCache(String javaFile) throws IOException {
        Path yoptavaPath = getYoptavaPathFromCache(javaFile);
        byte[] encoded = Files.readAllBytes(yoptavaPath);
        String content = new String(encoded, Charset.defaultCharset());
        return YoptavaParser.parseAndConvert(content);
    }

    public static void putYoptavaInCache(String file) throws IOException {
        String javaFile = getCachedYoptavaName(file);
        Path targetPath = getYoptavaPathFromCache(file);
        Path copiedPath = Files.copy(getYoptavaPath(file), targetPath);
        FileUtils.renameFile(copiedPath, javaFile);
    }

    public static void createSourcesInCacheDirectory() throws IOException {
        Files.createDirectory(getSourcesInCacheDirectoryPath());
    }

    private static Path getYoptavaPath(String file) {
        String sourcesDirectory = getSourcesDirectory();
        if (file != null) sourcesDirectory += FileUtils.fileSeparator + file;
        return FileUtils.getAbsolutePath(sourcesDirectory);
    }

    private static String getSourcesDirectory() {
        String sourcesDirectory = StringUtils.EMPTY_STRING;
        if (!YoptavaFiles.SOURCES_DIRECTORY.isEmpty()) sourcesDirectory = YoptavaFiles.SOURCES_DIRECTORY;
        return sourcesDirectory;
    }

    private static Path getYoptavaPathFromCache(String file) {
        String cachedFile = getSourcesInCacheDirectoryPath() + FileUtils.fileSeparator + file;
        return FileUtils.getAbsolutePath(cachedFile);
    }

    private static Path getSourcesInCacheDirectoryPath() {
        return FileUtils.getAbsolutePath(getSourcesInCacheDirectory());
    }

    private static String getSourcesInCacheDirectory() {
        String sourcesDirectory = CacheUtils.CACHE_DIRECTORY;
        boolean isSourcesDirectoryEmpty = YoptavaFiles.SOURCES_DIRECTORY.isEmpty();
        if (!isSourcesDirectoryEmpty) sourcesDirectory += FileUtils.fileSeparator + YoptavaFiles.SOURCES_DIRECTORY;
        return sourcesDirectory;
    }
}