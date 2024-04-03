package settings;

import parser.dictionary.Dictionary;
import parser.dictionary.LeptavaDictionary;
import parser.dictionary.RuptavaDictionary;
import parser.dictionary.YoptavaDictionary;

public enum LanguageType {

    YOPTAVA(".yoptava", new YoptavaDictionary()),
    RUPTAVA(".ruptava", new RuptavaDictionary()),
    LEPTAVA(".leptava", new LeptavaDictionary());

    public final String extension;
    public final Dictionary dictionary;

    LanguageType(String extension, Dictionary dictionary) {
        this.extension = extension;
        this.dictionary = dictionary;
    }
}
