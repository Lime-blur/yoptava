package settings;

import settings.abstraction.YoptavaSettings;
import settings.type.Language;

public final class GoptavaSettings implements YoptavaSettings {

    @Override
    public Language getLanguage() {
        return Settings.LANGUAGE_TYPE_GOPTAVA;
    }

    @Override
    public String getSourcesDirectory() {
        return Settings.SOURCES_DIRECTORY_GOPTAVA;
    }

    @Override
    public String getProjectSourcesDirectory() {
        return Settings.PROJECT_SOURCES_DIRECTORY_GOPTAVA;
    }

    @Override
    public String getMainClassName() {
        return Settings.MAIN_CLASS_NAME_GOPTAVA;
    }

    @Override
    public String getMainClassLoadMethod() {
        return Settings.MAIN_CLASS_LOAD_METHOD_GOPTAVA;
    }
}
