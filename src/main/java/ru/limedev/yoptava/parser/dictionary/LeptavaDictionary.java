package parser.dictionary;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class LeptavaDictionary implements Dictionary {

    private final Map<String, String> keywords = new HashMap<String, String>() {
        {
            put("вестный", "public");
            put("вид", "class");
            put("неумытный", "static");
            put("заговенный", "final");
            put("заточный", "void");
            put("ненарочитый", "abstract");
            put("утвердить", "assert");
            put("охабить", "break");
            put("убо", "case");
            put("изымати", "catch");
            put("прострети", "continue");
            put("абы", "default");
            put("деяти", "do");
            put("або", "else");
            put("противень", "enum");
            put("авва", "extends");
            put("докончание", "finally");
            put("деля", "for");
            put("аще", "if");
            put("зрак", "implements");
            put("въсхытити", "import");
            put("сыновец", "instanceof");
            put("здатель", "interface");
            put("присный", "native");
            put("създати", "new");
            put("кулёк", "package");
            put("кулек", "package");
            put("омженный", "private");
            put("омжённый", "private");
            put("бахтерный", "protected");
            put("бачко", "super");
            put("внегда", "switch");
            put("чающий", "synchronized");
            put("овый", "this");
            put("въвергнути", "throw");
            put("въвергает", "throws");
            put("скаредный", "transient");
            put("потягнути", "try");
            put("присно", "volatile");
            put("егда", "while");
            put("подати", "return");

            put("прелестный", "boolean");
            put("лишеник", "byte");
            put("образ", "char");
            put("сугубый", "double");
            put("наполый", "float");
            put("личьба", "int");
            put("сильник", "long");
            put("мухортый", "short");

            put("реснота", "true");
            put("лесть", "false");
            put("ничтожевелие", "null");
        }
    };

    @Override
    public @NotNull Map<String, String> getKeywords() {
        return keywords;
    }
}
