package ru.limedev.example.example_custom.settings;

import ru.limedev.example.example_custom.dictionary.MyptavaDictionary;
import ru.limedev.yoptava.files.FileUtils;
import ru.limedev.yoptava.settings.type.Language;

final class Settings {
    static final String PROJECT_PATH = System.getProperty("user.dir") + FileUtils.fileSeparator;

    // Custom settings
    static final Language LANGUAGE_MYPTAVA = new Language(".myptava", new MyptavaDictionary());
    static final String SOURCES_DIRECTORY_MYPTAVA = "myptava";
    static final String PROJECT_SOURCES_DIRECTORY_MYPTAVA = PROJECT_PATH + SOURCES_DIRECTORY_MYPTAVA + FileUtils.fileSeparator;
    static final String MAIN_CLASS_NAME_MYPTAVA = "Load";
    static final String MAIN_CLASS_LOAD_METHOD_MYPTAVA = "load";
}
