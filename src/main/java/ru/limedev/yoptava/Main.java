import com.itranswarp.compiler.JavaStringCompiler;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import files.FileUtils;
import files.YoptavaFiles;

public class Main {

    private static final Map<String, String> contents = new HashMap<>();
    private static final Map<String, Map<String, byte[]>> compileResults = new HashMap<>();

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        JavaStringCompiler compiler = new JavaStringCompiler();
        prepareCache();
        loadClasses();
        compileClasses(compiler);
        loadClasses(compiler);
    }

    private static void prepareCache() throws IOException {
        FileUtils.refreshCacheDirectory();
        for (String file : YoptavaFiles.files) {
            FileUtils.putYoptavaToCache(file);
        }
    }

    private static void loadClasses() throws IOException {
        for (String file : YoptavaFiles.files) {
            String javaFile = FileUtils.getCacheYoptavaName(file);
            contents.put(
                javaFile, FileUtils.readYoptavaFromCache(javaFile, Charset.defaultCharset())
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

    private static void loadClasses(JavaStringCompiler compiler) throws IOException, ClassNotFoundException {
        for (Map.Entry<String, Map<String, byte[]>> entry : compileResults.entrySet()) {
            String className = entry.getKey().replace(FileUtils.JAVA_EXTENSION, "");
            compiler.loadClass(className, entry.getValue());
        }
    }
}
