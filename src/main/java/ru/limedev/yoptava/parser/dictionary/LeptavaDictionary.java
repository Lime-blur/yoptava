package parser.dictionary;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class LeptavaDictionary implements Dictionary {

    private final Map<String, String> keywords = new HashMap<String, String>() {
        {
            // Keywords
            put("польный", "public");
            put("видъ", "class");
            put("неумытный", "static");
            put("заговенный", "final");
            put("заточный", "void");
            put("ненарочитый", "abstract");
            put("утвердить", "assert");
            put("охабить", "break");
            put("убо", "case");
            put("изымати", "catch");
            put("прострети", "continue");
            put("беспроторица", "default");
            put("деяти", "do");
            put("або", "else");
            put("противень", "enum");
            put("улучити", "extends");
            put("докончание", "finally");
            put("деля", "for");
            put("аще", "if");
            put("зракъ", "implements");
            put("въсхытити", "import");
            put("сыновецъ", "instanceof");
            put("здатель", "interface");
            put("сыроядецъ", "native");
            put("създати", "new");
            put("кулёкъ", "package");
            put("кулекъ", "package");
            put("омженный", "private");
            put("омжённый", "private");
            put("бахтерный", "protected");
            put("бачко", "super");
            put("внегда", "switch");
            put("чающий", "synchronized");
            put("овый", "this");
            put("въвергнути", "throw");
            put("въвергаетъ", "throws");
            put("скаредный", "transient");
            put("окушатися", "try");
            put("присно", "volatile");
            put("егда", "while");
            put("подати", "return");

            // Primitives
            put("прелестный", "boolean");
            put("лишеникъ", "byte");
            put("образъ", "char");
            put("сугубый", "double");
            put("наполый", "float");
            put("личьба", "int");
            put("сильникъ", "long");
            put("мухортый", "short");

            // Values
            put("реснота", "true");
            put("лесть", "false");
            put("ничтожевелие", "null");

            // Object
            put("Начальникъ", "Object");
            put("поятиВидъ", "getClass");
            put("личьбаРуды", "hashCode");
            put("сверстати", "equals");
            put("създатиКлонъ", "clone");
            put("кБересте", "toString");
            put("насочити", "notify");
            put("насочитиВсихъ", "notifyAll");
            put("поджидъ", "wait");
            put("избыть", "finalize");

            // Iterable
            put("Соньмъ", "Iterable");
            put("сонмъ", "iterator");
            put("деляВсихъ", "forEach");
            put("волокъ", "spliterator");

            // Collection
            put("мера", "size");
            put("пустъ", "isEmpty");
            put("съдрьжитъ", "contains");
            put("кРяду", "toArray");
            put("бавить", "add");
            put("зати", "remove");
            put("съдрьжитВсихъ", "containsAll");
            put("бавитьВсихъ", "addAll");
            put("затиВсихъ", "removeAll");
            put("затиАще", "removeIf");
            put("бергтиВсихъ", "retainAll");
            put("истрошати", "clear");
            put("ендова", "stream");
            put("ендовыйРядъ", "parallelStream");

            // List
            put("Противень", "List");
            put("наметыватиВсимъ", "replaceAll");
            put("поставитиВрядъ", "sort");
            put("пояти", "get");
            put("нарядити", "set");
            put("личьбаУ", "indexOf");
            put("последьнЛичьбаУ", "lastIndexOf");
            put("противеньСонмъ", "listIterator");
            put("мелъкПротивень", "subList");

            // ArrayList
            put("РядПротивеня", "ArrayList");

            // Set
            put("Съвъкупность", "Set");

            // HashSet
            put("РуднаяСъвъкупность", "HashSet");

            // String
            put("Береста", "String");
            put("знакъ", "value");
            put("руда", "hash");
            put("парольТъчькаВ", "codePointAt");
            put("парольТъчькаПредъ", "codePointBefore");
            put("коликоПарольТъчекъ", "codePointCount");
            put("двигнуПоПарольТъчьке", "offsetByCodePoints");
            put("поятиОбразы", "getChars");
            put("поятиЛишеники", "getBytes");
            put("сверстатиБересту", "contentEquals");
            put("сверстатиБезЗнаньРегистра", "equalsIgnoreCase");
            put("РЯД_НЕЧОУВЬСТВИЙ_К_ЧРЕДИМОСТИ", "CASE_INSENSITIVE_ORDER");
            put("подобнеБезЗнаньРегистраСъ", "compareToIgnoreCase");
            put("местоСлично", "regionMatches");
            put("начатиСъ", "startsWith");
            put("коньцьСъ", "endsWith");
            put("мелъкБереста", "substring");
            put("единити", "concat");
            put("наметывати", "replace");
            put("слично", "matches");
            put("наметыватиПрьвъ", "replaceFirst");
            put("поскепати", "split");
            put("приснити", "join");
            put("кНегорнимуРегистру", "toLowerCase");
            put("кГорнимуРегистру", "toUpperCase");
            put("укорити", "trim");
            put("кРядуОбразовъ", "toCharArray");
            put("превратити", "format");
            put("знакУ", "valueOf");
            put("създатиКлонЗнакаУ", "copyValueOf");
            put("закромъ", "intern");

            // Serializable
            put("Толмачъ", "Serializable");

            // Comparable
            put("Подобний", "Comparable");
            put("подобнеСъ", "compareTo");

            // Comparator
            put("Укоритель", "Comparator");
            put("подобне", "compare");
            put("поврьтелый", "reversed");
            put("послеПодобить", "thenComparing");
            put("послеПодобитьЛичбу", "thenComparingInt");
            put("послеПодобитьСильникъ", "thenComparingLong");
            put("послеПодобитьСугубый", "thenComparingDouble");
            put("поврьтетиЧредимость", "reverseOrder");
            put("сущаяЧредимость", "naturalOrder");
            put("ничтожевелиеПрьвъ", "nullsFirst");
            put("ничтожевелиеПоследьнъ", "nullsLast");
            put("подобить", "comparing");
            put("подобитьЛичбу", "comparingInt");
            put("подобитьСильникъ", "comparingLong");
            put("подобитьСугубый", "comparingDouble");

            // CharSequence
            put("ЧредимостьОбразовъ", "CharSequence");
            put("дьля", "length");
            put("образВъ", "charAt");
            put("мелъкЧредимость", "subSequence");
            put("образы", "chars");
            put("парольТъчьки", "codePoints");

            // System
            put("Система", "System");
            put("Система.трость", "System.in");
            put("Система.застава", "System.out");
            put("Система.залазъ", "System.err");
            put("Система.нарядитиТрость", "System.setIn");
            put("Система.нарядитиЗаставу", "System.setOut");
            put("Система.нарядитиЗалазъ", "System.setErr");
            put("Система.слухъ", "System.console");
            put("Система.улучитаяТруба", "System.inheritedChannel");
            put("Система.нарядитиГридь", "System.setSecurityManager");
            put("Система.поятиГридь", "System.getSecurityManager");
            put("Система.веремяМиллисекунды", "System.currentTimeMillis");
            put("Система.наноВеремя", "System.nanoTime");
            put("Система.създатиКлонОбразовъ", "System.arraycopy");
            put("Система.узнатиЛичьбуРуды", "System.identityHashCode");
            put("Система.поятиЧьрты", "System.getProperties");
            put("Система.делБересты", "System.lineSeparator");
            put("Система.нарядитиЧьрты", "System.setProperties");
            put("Система.поятиЧьрту", "System.getProperty");
            put("Система.нарядитиЧьрту", "System.setProperty");
            put("Система.истрошатиЧьрту", "System.clearProperty");
            put("Система.поятиСущественность", "System.getenv");
            put("Система.истаяти", "System.exit");
            put("Система.рупосъ", "System.gc");
            put("Система.пуститиИзбытокъ", "System.runFinalization");
            put("Система.пуститиИзбытокПриИстаянии", "System.runFinalizersOnExit");
            put("Система.загрозити", "System.load");
            put("Система.запуститиВместилище", "System.loadLibrary");
            put("Система.сопоставитиИмяВместилища", "System.mapLibraryName");

            // System short methods
            put("распечататиСистемой", "System.out.print");
            put("распечататиСистемойБересту", "System.out.println");
            put("распечататиСистемойПревратити", "System.out.printf");

            // PrintStream
            put("ЕндоваПечать", "PrintStream");
            put("промыти", "flush");
            put("закрыти", "close");
            put("проверитиЗалазъ", "checkError");
            put("пьсати", "write");
            put("распечатати", "print");
            put("распечататиБересту", "println");
            put("распечататиПревратити", "printf");
            put("съчетати", "append");

            // Map
            put("Реестръ", "Map");
            put("съдрьжитКлючь", "containsKey");
            put("съдрьжитЗнакъ", "containsValue");
            put("положити", "put");
            put("положитиВсихъ", "putAll");
            put("съвъкупностьКлючей", "keySet");
            put("знаки", "values");
            put("съвъкупностьСроковРеестра", "entrySet");
            put("поятиИлиБеспроторица", "getOrDefault");
            put("положитиАщеНеСъдрьжитъ", "putIfAbsent");
            put("определитиАщеНеСъдрьжитъ", "computeIfAbsent");
            put("определити", "compute");
            put("слити", "merge");

            // Entry
            put("СрокРеестра", "Entry");
            put("поятиКлючь", "getKey");
            put("поятиЗнакъ", "getValue");
            put("нарядитиЗнакъ", "setValue");
            put("подобитьПоКлючу", "comparingByKey");
            put("подобитьПоЗнаку", "comparingByValue");

            // HashMap
            put("РудныйРеестръ", "HashMap");

            // Boolean
            put("Прелестный", "Boolean");

            // Byte
            put("Лишеник", "Byte");

            // Character
            put("Образ", "Character");

            // Double
            put("Сугубый", "Double");

            // Float
            put("Наполый", "Float");

            // Integer
            put("Личьба", "Integer");

            // Long
            put("Сильник", "Long");

            // Short
            put("Мухортый", "Short");
        }
    };

    @Override
    public @NotNull Map<String, String> getKeywords() {
        return keywords;
    }
}
