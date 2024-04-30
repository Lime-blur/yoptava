package parser.dictionary.abstraction;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

public interface Dictionary {

    @NotNull
    Map<String, String> getKeywords();
}
