package ru.limedev.yoptava.settings.type;

import ru.limedev.yoptava.parser.dictionary.GoptavaDictionary;
import ru.limedev.yoptava.parser.dictionary.LeptavaDictionary;
import ru.limedev.yoptava.parser.dictionary.RuptavaDictionary;

public enum LanguageType {

    GOPTAVA(new Language(".goptava", new GoptavaDictionary())),
    RUPTAVA(new Language(".ruptava", new RuptavaDictionary())),
    LEPTAVA(new Language(".leptava", new LeptavaDictionary()));

    public final Language language;

    LanguageType(Language language) {
        this.language = language;
    }
}