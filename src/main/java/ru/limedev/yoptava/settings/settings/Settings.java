package settings.settings;

import files.FileUtils;
import settings.LanguageType;

final class Settings {
    static final String PROJECT_PATH = System.getProperty("user.dir") + FileUtils.fileSeparator;
    static final LanguageType LANGUAGE_TYPE_DEFAULT = LanguageType.GOPTAVA;
    static final String SOURCES_DIRECTORY_DEFAULT = "goptava";
    static final String PROJECT_SOURCES_DIRECTORY_DEFAULT = PROJECT_PATH + SOURCES_DIRECTORY_DEFAULT + FileUtils.fileSeparator;
    static final String MAIN_CLASS_NAME_DEFAULT = "Load";
    static final String MAIN_CLASS_LOAD_METHOD_DEFAULT = "load";
}
