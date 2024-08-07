package ru.limedev.yoptava.settings;

import ru.limedev.yoptava.settings.abstraction.YoptavaSettings;
import ru.limedev.yoptava.settings.type.Language;

public final class BelptavaSettings implements YoptavaSettings {

    @Override
    public Language getLanguage() {
        return Settings.LANGUAGE_BELPTAVA;
    }

    @Override
    public String getSourcesDirectory() {
        return Settings.SOURCES_DIRECTORY_BELPTAVA;
    }

    @Override
    public String getProjectSourcesDirectory() {
        return Settings.PROJECT_SOURCES_DIRECTORY_BELPTAVA;
    }

    @Override
    public String getMainClassName() {
        return Settings.MAIN_CLASS_NAME_BELPTAVA;
    }

    @Override
    public String getMainClassLoadMethod() {
        return Settings.MAIN_CLASS_LOAD_METHOD_BELPTAVA;
    }
}