package settings;

import parser.dictionary.abstraction.Dictionary;
import parser.dictionary.LeptavaDictionary;
import parser.dictionary.RuptavaDictionary;
import parser.dictionary.GoptavaDictionary;

public enum LanguageType {

    GOPTAVA(".goptava", new GoptavaDictionary()),
    RUPTAVA(".ruptava", new RuptavaDictionary()),
    LEPTAVA(".leptava", new LeptavaDictionary());

    public final String extension;
    public final Dictionary dictionary;

    LanguageType(String extension, Dictionary dictionary) {
        this.extension = extension;
        this.dictionary = dictionary;
    }
}
