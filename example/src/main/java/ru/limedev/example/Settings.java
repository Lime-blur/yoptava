import files.FileUtils;
import settings.LanguageType;

public class Settings {
    public static final String PROJECT_PATH = System.getProperty("user.dir") + FileUtils.fileSeparator;
    public static final LanguageType LANGUAGE_TYPE = LanguageType.LEPTAVA;
    public static final String SOURCES_DIRECTORY = "leptava";
    public static final String PROJECT_SOURCES_DIRECTORY = PROJECT_PATH + SOURCES_DIRECTORY + FileUtils.fileSeparator;
    public static final String MAIN_CLASS_NAME = "Load";
    public static final String MAIN_CLASS_LOAD_METHOD = "load";
}
