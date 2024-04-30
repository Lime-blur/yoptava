package settings.settings;

import settings.LanguageType;
import settings.settings.abstraction.YoptavaSettings;

public final class DefaultSettings implements YoptavaSettings {

    @Override
    public LanguageType getLanguageType() {
        return Settings.LANGUAGE_TYPE_DEFAULT;
    }

    @Override
    public String getSourcesDirectory() {
        return Settings.SOURCES_DIRECTORY_DEFAULT;
    }

    @Override
    public String getProjectSourcesDirectory() {
        return Settings.PROJECT_SOURCES_DIRECTORY_DEFAULT;
    }

    @Override
    public String getMainClassName() {
        return Settings.MAIN_CLASS_NAME_DEFAULT;
    }

    @Override
    public String getMainClassLoadMethod() {
        return Settings.MAIN_CLASS_LOAD_METHOD_DEFAULT;
    }
}
