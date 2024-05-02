package settings.type;

import parser.dictionary.GoptavaDictionary;
import parser.dictionary.LeptavaDictionary;
import parser.dictionary.RuptavaDictionary;

public enum LanguageType {

    GOPTAVA(
        new Language(".goptava", new GoptavaDictionary())
    ),
    RUPTAVA(
        new Language(".ruptava", new RuptavaDictionary())
    ),
    LEPTAVA(
        new Language(".leptava", new LeptavaDictionary())
    );

    public final Language language;

    LanguageType(Language language) {
        this.language = language;
    }
}