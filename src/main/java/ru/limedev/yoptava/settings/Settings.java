package ru.limedev.yoptava.settings;

import ru.limedev.yoptava.files.FileUtils;
import ru.limedev.yoptava.settings.type.Language;
import ru.limedev.yoptava.settings.type.LanguageType;

final class Settings {
    static final String PROJECT_PATH = System.getProperty("user.dir") + FileUtils.fileSeparator;

    // Goptava default settings
    static final Language LANGUAGE_GOPTAVA = LanguageType.GOPTAVA.language;
    static final String SOURCES_DIRECTORY_GOPTAVA = "goptava";
    static final String PROJECT_SOURCES_DIRECTORY_GOPTAVA = PROJECT_PATH + SOURCES_DIRECTORY_GOPTAVA + FileUtils.fileSeparator;
    static final String MAIN_CLASS_NAME_GOPTAVA = "Load";
    static final String MAIN_CLASS_LOAD_METHOD_GOPTAVA = "load";

    // Leptava default settings
    static final Language LANGUAGE_LEPTAVA = LanguageType.LEPTAVA.language;
    static final String SOURCES_DIRECTORY_LEPTAVA = "leptava";
    static final String PROJECT_SOURCES_DIRECTORY_LEPTAVA = PROJECT_PATH + SOURCES_DIRECTORY_LEPTAVA + FileUtils.fileSeparator;
    static final String MAIN_CLASS_NAME_LEPTAVA = "Load";
    static final String MAIN_CLASS_LOAD_METHOD_LEPTAVA = "load";

    // Ruptava default settings
    static final Language LANGUAGE_RUPTAVA = LanguageType.RUPTAVA.language;
    static final String SOURCES_DIRECTORY_RUPTAVA = "ruptava";
    static final String PROJECT_SOURCES_DIRECTORY_RUPTAVA = PROJECT_PATH + SOURCES_DIRECTORY_RUPTAVA + FileUtils.fileSeparator;
    static final String MAIN_CLASS_NAME_RUPTAVA = "Load";
    static final String MAIN_CLASS_LOAD_METHOD_RUPTAVA = "load";
}
