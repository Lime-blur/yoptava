package parser.dictionary;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class LeptavaDictionary implements Dictionary {

    private final Map<String, String> keywords = new HashMap<String, String>() {
        {
            // TODO: Must be filled.
        }
    };

    @Override
    public @NotNull Map<String, String> getKeywords() {
        return keywords;
    }
}
