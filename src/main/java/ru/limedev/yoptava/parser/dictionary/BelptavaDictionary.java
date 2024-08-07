package ru.limedev.yoptava.parser.dictionary;

import org.jetbrains.annotations.NotNull;
import ru.limedev.yoptava.parser.dictionary.abstraction.Dictionary;

import java.util.HashMap;
import java.util.Map;

public final class BelptavaDictionary implements Dictionary {

    private final Map<String, String> keywords = new HashMap<String, String>() {
        {
            // Keywords
            put("публічны", "public");
            put("клас", "class");
            put("статычны", "static");
            put("канчатковы", "final");
            put("пусты", "void");
            put("абстрактны", "abstract");
            put("зацвердзіць", "assert");
            put("перапыніць", "break");
            put("выпадак", "case");
            put("злавіць", "catch");
            put("працягваць", "continue");
            put("стандартны", "default");
            put("выконваць", "do");
            put("інакш", "else");
            put("пералік", "enum");
            put("пашырае", "extends");
            put("канчаткова", "finally");
            put("для", "for");
            put("калі", "if");
            put("рэалізуе", "implements");
            put("імпартаваць", "import");
            put("экзэмпляр", "instanceof");
            put("інтэрфейс", "interface");
            put("родны", "native");
            put("новы", "new");
            put("пакет", "package");
            put("прыватны", "private");
            put("абаронены", "protected");
            put("бацька", "super");
            put("перамыкач", "switch");
            put("сінхранізаваны", "synchronized");
            put("гэты", "this");
            put("кідаць", "throw");
            put("кідае", "throws");
            put("несерыялізаваны", "transient");
            put("спрабаваць", "try");
            put("атамарны", "volatile");
            put("пакуль", "while");
            put("вярнуць", "return");

            // Primitives
            put("лагічны", "boolean");
            put("байт", "byte");
            put("сімвал", "char");
            put("падвойны", "double");
            put("плывучы", "float");
            put("цэлы", "int");
            put("доўгі", "long");
            put("кароткі", "short");

            // Values
            put("праўда", "true");
            put("хлусня", "false");
            put("нулявы", "null");

            // Annotations
            put("Перавызначыць", "Override");

            // Object
            put("Рэч", "Object");
            put("атрымацьКлас", "getClass");
            put("хэшКод", "hashCode");
            put("аднолькавы", "equals");
            put("кланаваць", "clone");
            put("даРадка", "toString");
            put("апавясціць", "notify");
            put("паведаміцьУсё", "notifyAll");
            put("чакаць", "wait");
            put("фіналізаваць", "finalize");

            // Iterable
            put("Ітэрыруемы", "Iterable");
            put("ітэратар", "iterator");
            put("дляКожнага", "forEach");
            put("сплітэрэтар", "spliterator");

            // Collection
            put("памер", "size");
            put("пустаЛі", "isEmpty");
            put("змяшчае", "contains");
            put("даМасіву", "toArray");
            put("дадаць", "add");
            put("прыбраць", "remove");
            put("змяшчаеЎсе", "containsAll");
            put("дадацьУсе", "addAll");
            put("прыбрацьУсе", "removeAll");
            put("прыбрацьКалі", "removeIf");
            put("утрымацьУсё", "retainAll");
            put("ачысціць", "clear");
            put("стрым", "stream");
            put("паралельныСтрым", "parallelStream");

            // List
            put("Спіс", "List");
            put("замяніцьУсе", "replaceAll");
            put("сартаваць", "sort");
            put("атрымаць", "get");
            put("усталяваць", "set");
            put("індэксУ", "indexOf");
            put("апошніІндэксУ", "lastIndexOf");
            put("ітэратарСпісу", "listIterator");
            put("падСпіс", "subList");

            // ArrayList
            put("СпісМасіва", "ArrayList");

            // Set
            put("Набор", "Set");

            // HashSet
            put("ХэшНабор", "HashSet");

            // String
            put("Радок", "String");
            put("значэнне", "value");
            put("хэш", "hash");
            put("кодаваяКропкаЎ", "codePointAt");
            put("кодаваяКропкаДа", "codePointBefore");
            put("колькасцьКодавыхКропак", "codePointCount");
            put("зрухПаКодавыхКропках", "offsetByCodePoints");
            put("атрымацьСімвалы", "getChars");
            put("атрымацьБайты", "getBytes");
            put("кантэнтАднолькавы", "contentEquals");
            put("роўныІгнаруючыРэгістр", "equalsIgnoreCase");
            put("ПАРАДАК_НЕАДЧУВАЛЬНЫ_ДА_РЭГІСТРА", "CASE_INSENSITIVE_ORDER");
            put("супаставіцьІгнаруючыРэгістрЗ", "compareToIgnoreCase");
            put("рэгіёнАдпавядае", "regionMatches");
            put("пачынаеццаЗ", "startsWith");
            put("заканчваеццаЗ", "endsWith");
            put("падрадок", "substring");
            put("згуртаваць", "concat");
            put("замяніць", "replace");
            put("супадае", "matches");
            put("замяніцьПершы", "replaceFirst");
            put("раскалоць", "split");
            put("злучыць", "join");
            put("даНіжнягаРэгістра", "toLowerCase");
            put("даВерхнягаРэгістра", "toUpperCase");
            put("абрэзаць", "trim");
            put("даСімвальнагаМасіву", "toCharArray");
            put("фарматаваць", "format");
            put("значэннеЎ", "valueOf");
            put("капіявацьЗначэннеЎ", "copyValueOf");
            put("кананічнаеПрадстаўленне", "intern");

            // Serializable
            put("Серыялізаваны", "Serializable");

            // Comparable
            put("Супастаўны", "Comparable");
            put("супаставіцьЗ", "compareTo");

            // Comparator
            put("Кампаратар", "Comparator");
            put("супаставіць", "compare");
            put("перавернуты", "reversed");
            put("затымСупастаўляючы", "thenComparing");
            put("затымСупастаўляючыЦэлы", "thenComparingInt");
            put("затымСупастаўляючыДоўгі", "thenComparingLong");
            put("затымСупастаўляючыПадвойны", "thenComparingDouble");
            put("перавернутыПарадак", "reverseOrder");
            put("натуральныПарадак", "naturalOrder");
            put("нуліСпачатку", "nullsFirst");
            put("нуліАпошнія", "nullsLast");
            put("параўнанне", "comparing");
            put("параўнаннеЦэлага", "comparingInt");
            put("параўнаннеДоўгага", "comparingLong");
            put("параўнаннеПадвойнага", "comparingDouble");

            // CharSequence
            put("СімвальнаяПаслядоўнасць", "CharSequence");
            put("даўжыня", "length");
            put("сімвалУ", "charAt");
            put("падПаслядоўнасць", "subSequence");
            put("сімвалы", "chars");
            put("кодавыяКропкі", "codePoints");

            // System
            put("Сістэма", "System");
            put("Сістэма.увод", "System.in");
            put("Сістэма.вывад", "System.out");
            put("Сістэма.памылка", "System.err");
            put("Сістэма.усталявацьУвод", "System.setIn");
            put("Сістэма.усталявацьВывад", "System.setOut");
            put("Сістэма.усталявацьПамылку", "System.setErr");
            put("Сістэма.кансоль", "System.console");
            put("Сістэма.успадкаваныКанал", "System.inheritedChannel");
            put("Сістэма.усталявацьМенеджэрБяспекі", "System.setSecurityManager");
            put("Сістэма.атрымацьМенеджэрБяспекі", "System.getSecurityManager");
            put("Сістэма.бягучыЧасМілісекунды", "System.currentTimeMillis");
            put("Сістэма.нанаЧас", "System.nanoTime");
            put("Сістэма.капіявацьМасіў", "System.arraycopy");
            put("Сістэма.ідэнтыфікацыйныХэшКод", "System.identityHashCode");
            put("Сістэма.атрымацьУласцівасці", "System.getProperties");
            put("Сістэма.падзельнікРадкоў", "System.lineSeparator");
            put("Сістэма.усталявацьУласцівасці", "System.setProperties");
            put("Сістэма.атрымацьУласцівасць", "System.getProperty");
            put("Сістэма.усталявацьУласцівасць", "System.setProperty");
            put("Сістэма.ачысціцьУласцівасць", "System.clearProperty");
            put("Сістэма.атрымацьАкружэнне", "System.getenv");
            put("Сістэма.выхад", "System.exit");
            put("Сістэма.зборшчыкСмецця", "System.gc");
            put("Сістэма.запусціцьФіналізацыю", "System.runFinalization");
            put("Сістэма.запусціцьФіналізатараўПрыВыходзе", "System.runFinalizersOnExit");
            put("Сістэма.загрузіць", "System.load");
            put("Сістэма.запусціцьБібліятэку", "System.loadLibrary");
            put("Сістэма.супаставіцьІмяБібліятэкі", "System.mapLibraryName");

            // System short methods
            put("сістэмнаРаздрукаваць", "System.out.print");
            put("сістэмнаРаздрукавацьРадок", "System.out.println");
            put("сістэмнаРаздрукавацьФарматна", "System.out.printf");

            // PrintStream
            put("ПатокДруку", "PrintStream");
            put("прамыць", "flush");
            put("закрыць", "close");
            put("праверыцьПамылку", "checkError");
            put("запісаць", "write");
            put("раздрукаваць", "print");
            put("раздрукавацьРадок", "println");
            put("раздрукавацьФарматна", "printf");
            put("далучыць", "append");

            // Map
            put("Карта", "Map");
            put("змяшчаеКлюч", "containsKey");
            put("змяшчаеЗначэнне", "containsValue");
            put("пакласці", "put");
            put("пакласціЎсё", "putAll");
            put("наборКлючоў", "keySet");
            put("значэння", "values");
            put("наборЗапісаў", "entrySet");
            put("атрымацьАбоПаЗмаўчанні", "getOrDefault");
            put("пакласціКаліАдсутнічае", "putIfAbsent");
            put("вылічыцьКаліАдсутнічае", "computeIfAbsent");
            put("вылічыць", "compute");
            put("зліць", "merge");

            // Entry
            put("Запіс", "Entry");
            put("атрымацьКлюч", "getKey");
            put("атрымацьЗначэнне", "getValue");
            put("усталявацьЗначэнне", "setValue");
            put("параўнаннеПаКлючу", "comparingByKey");
            put("параўнаннеПаЗначэнні", "comparingByValue");

            // HashMap
            put("ХэшКарта", "HashMap");

            // Boolean
            put("Лагічны", "Boolean");

            // Byte
            put("Байт", "Byte");

            // Character
            put("Сімвал", "Character");

            // Double
            put("Падвойны", "Double");

            // Float
            put("Плывучы", "Float");

            // Integer
            put("Цэлы", "Integer");

            // Long
            put("Доўгі", "Long");

            // Short
            put("Кароткі", "Short");
        }
    };

    @Override
    public @NotNull Map<String, String> getKeywords() {
        return keywords;
    }
}
