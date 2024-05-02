package ru.limedev.example.example_custom.dictionary;

import org.jetbrains.annotations.NotNull;
import ru.limedev.yoptava.parser.dictionary.abstraction.Dictionary;

import java.util.HashMap;
import java.util.Map;

public final class MyptavaDictionary implements Dictionary {

    private final Map<String, String> keywords = new HashMap<String, String>() {
        {
            put("öffentlich", "public");
            put("klasse", "class");
            put("statisch", "static");
            put("finale", "final");
            put("leere", "void");
            put("System.aus.druckenln", "System.out.println");
        }
    };

    @Override
    public @NotNull Map<String, String> getKeywords() {
        return keywords;
    }
}
