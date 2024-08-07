# Yoptava

[![yoptava logo](https://github.com/Lime-blur/yoptava/blob/main/images/yoptava.png)](https://github.com/Lime-blur/yoptava/)

[![release](https://jitpack.io/v/Lime-blur/yoptava.svg)](https://github.com/Lime-blur/yoptava/releases/latest)
[![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)](https://github.com/Lime-blur/yoptava/issues)
[![yoptava license](https://img.shields.io/github/license/Lime-blur/yoptava)](https://github.com/Lime-blur/yoptava/blob/main/LICENSE)

# Содержание
1. [О языке](https://github.com/Lime-blur/yoptava?tab=readme-ov-file#%D0%BE-%D1%8F%D0%B7%D1%8B%D0%BA%D0%B5)
2. [Разработка](https://github.com/Lime-blur/yoptava?tab=readme-ov-file#%D1%80%D0%B0%D0%B7%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%BA%D0%B0)
3. [Предупреждения](https://github.com/Lime-blur/yoptava?tab=readme-ov-file#%D0%BF%D1%80%D0%B5%D0%B4%D1%83%D0%BF%D1%80%D0%B5%D0%B6%D0%B4%D0%B5%D0%BD%D0%B8%D1%8F)
4. [Использование](https://github.com/Lime-blur/yoptava?tab=readme-ov-file#%D0%B8%D1%81%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5)
5. [Добавление собственного словаря](https://github.com/Lime-blur/yoptava?tab=readme-ov-file#%D0%B4%D0%BE%D0%B1%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D0%B5-%D1%81%D0%BE%D0%B1%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D0%BE%D0%B3%D0%BE-%D1%81%D0%BB%D0%BE%D0%B2%D0%B0%D1%80%D1%8F)
6. [Проблемы](https://github.com/Lime-blur/yoptava?tab=readme-ov-file#%D0%BF%D1%80%D0%BE%D0%B1%D0%BB%D0%B5%D0%BC%D1%8B)
7. [Добавление подсветки синтаксиса](https://github.com/Lime-blur/yoptava?tab=readme-ov-file#%D0%B4%D0%BE%D0%B1%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D0%B5-%D0%BF%D0%BE%D0%B4%D1%81%D0%B2%D0%B5%D1%82%D0%BA%D0%B8-%D1%81%D0%B8%D0%BD%D1%82%D0%B0%D0%BA%D1%81%D0%B8%D1%81%D0%B0)
8. [Примеры](https://github.com/Lime-blur/yoptava?tab=readme-ov-file#%D0%BF%D1%80%D0%B8%D0%BC%D0%B5%D1%80%D1%8B)

## О языке
Yoptava — это первый в мире язык программирования на русском языке, транслируемый в Java с помощью Runtime компилятора. Yoptava позволяет выбрать определённую лексику для программирования, например:

- [ruptava](https://github.com/Lime-blur/yoptava/blob/main/example/ruptava) — классический язык программирования Java на русском языке
- [belptava](https://github.com/Lime-blur/yoptava/blob/main/example/belptava) — классический язык программирования Java на белорусском языке
- [goptava](https://github.com/Lime-blur/yoptava/blob/main/example/goptava) — язык программирования Java для гопников и реальных пацанов, основанный на [YoptaScript](http://yopta.space/)
- [leptava](https://github.com/Lime-blur/yoptava/blob/main/example/leptava) — язык программирования Java использующий старославянскую лексику

## Разработка

Вся разработка и поиск ошибок ведётся в ветке [**develop**](https://github.com/Lime-blur/yoptava/tree/develop)!
При разработке языка использовался язык программирования [YoptaScript](http://yopta.space/), [Словарь старославянских слов](https://hogwarts.ru/library/show.php?cat=1&id=39503&uid=guest), [Словарь старорусских слов](https://proza.ru/2022/11/18/1773), а также [Викисловарь](https://www.wiktionary.org/).

## Предупреждения

> [!CAUTION]
> Yoptava была реализована всего за несколько дней и не является серьёзной разработкой.<br>
> Yoptava не несёт в себе цели оскорбить кого-то или унизить. Yoptava содержит **множество нецензурной лексики**.

## Использование

1. Добавьте репозиторий JitPack в файл сборки:
```XML
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

2. Добавьте зависимость:
```XML
<dependency>
    <groupId>com.github.Lime-blur</groupId>
    <artifactId>yoptava</artifactId>
    <version>latest_version</version>
</dependency>
```

3. Инициализируйте необходимый язык программирования, например `Goptava`:
```Java
public class Main {
    public static void main(String[] args) {
        Yoptava.initGoptava();
    }
}
```

4. Приступайте к написанию русскоязычного Java кода в файле `Авторитет.goptava`, предварительно положив его в папку `goptava` в корне вашего проекта! Примеры реализации:
    - Goptava: [goptava](https://github.com/Lime-blur/yoptava/blob/main/example/goptava), [example_goptava](https://github.com/Lime-blur/yoptava/blob/main/example/src/main/java/ru/limedev/example/example_goptava)
    - Leptava: [leptava](https://github.com/Lime-blur/yoptava/blob/main/example/leptava), [example_leptava](https://github.com/Lime-blur/yoptava/blob/main/example/src/main/java/ru/limedev/example/example_leptava)
    - Ruptava: [ruptava](https://github.com/Lime-blur/yoptava/blob/main/example/ruptava), [example_ruptava](https://github.com/Lime-blur/yoptava/blob/main/example/src/main/java/ru/limedev/example/example_ruptava)
    - Belptava: [belptava](https://github.com/Lime-blur/yoptava/blob/main/example/belptava), [example_belptava](https://github.com/Lime-blur/yoptava/blob/main/example/src/main/java/ru/limedev/example/example_belptava)

## Добавление собственного словаря

Yoptava поддерживает возможность добавления собственного словаря. Для этого необходимо:

1. Реализовать класс словаря:
```Java
public final class MyptavaDictionary implements Dictionary {

    private final Map<String, String> keywords = new HashMap<String, String>() {
        {
            put("ключевое слово в вашем языке", "оригинал ключевого слова Java");
        }
    };

    @Override
    public @NotNull Map<String, String> getKeywords() {
        return keywords;
    }
}
```

2. Создать собственные настройки:
```Java
public final class Settings {
    static final String PROJECT_PATH = System.getProperty("user.dir") + FileUtils.fileSeparator;
    static final Language LANGUAGE_MYPTAVA = new Language(".myptava", new MyptavaDictionary());
    static final String SOURCES_DIRECTORY_MYPTAVA = "myptava";
    static final String PROJECT_SOURCES_DIRECTORY_MYPTAVA = PROJECT_PATH + SOURCES_DIRECTORY_MYPTAVA + FileUtils.fileSeparator;
    static final String MAIN_CLASS_NAME_MYPTAVA = "Load";
    static final String MAIN_CLASS_LOAD_METHOD_MYPTAVA = "load";
}
```

3. Реализовать класс настроек:
```Java
public final class MyptavaSettings implements YoptavaSettings {

    @Override
    public Language getLanguage() {
        return Settings.LANGUAGE_MYPTAVA;
    }

    @Override
    public String getSourcesDirectory() {
        return Settings.SOURCES_DIRECTORY_MYPTAVA;
    }

    @Override
    public String getProjectSourcesDirectory() {
        return Settings.PROJECT_SOURCES_DIRECTORY_MYPTAVA;
    }

    @Override
    public String getMainClassName() {
        return Settings.MAIN_CLASS_NAME_MYPTAVA;
    }

    @Override
    public String getMainClassLoadMethod() {
        return Settings.MAIN_CLASS_LOAD_METHOD_MYPTAVA;
    }
}
```

4. Инициализировать собственный язык программирования:
```Java
public class Main {

    private static final MyptavaSettings myptavaSettings = new MyptavaSettings();

    public static void main(String[] args) {
        Yoptava.init(myptavaSettings);
    }
}
```

5. После этого можно приступать к написанию кода на вашем языке программирования в файле `Load.myptava`, предварительно положив его в папку `myptava` в корне вашего проекта! Пример реализации: [myptava](https://github.com/Lime-blur/yoptava/blob/main/example/myptava), [example_custom](https://github.com/Lime-blur/yoptava/blob/main/example/src/main/java/ru/limedev/example/example_custom).

## Проблемы

- **Приветствуется** упрощение парсинга файлов в классе [YoptavaParser](https://github.com/Lime-blur/yoptava/blob/main/src/main/java/ru/limedev/yoptava/parser/YoptavaParser.java)
- **Очень приветствуется** дополнение словарей `goptava`, `ruptava`, `belptava` и `leptava`

## Добавление подсветки синтаксиса
Если вы пользуетесь Intellij Idea, вы можете добавить подсветку синтаксиса `.goptava`, `.ruptava`, `belptava`, `.leptava` файлов используя следующие файлы: [Goptava.txt](https://github.com/Lime-blur/yoptava/blob/main/intellij_settings/editor_filetypes/Goptava.txt), [Ruptava.txt](https://github.com/Lime-blur/yoptava/blob/main/intellij_settings/editor_filetypes/Ruptava.txt), [Belptava.txt](https://github.com/Lime-blur/yoptava/blob/main/intellij_settings/editor_filetypes/Belptava.txt), [Leptava.txt](https://github.com/Lime-blur/yoptava/blob/main/intellij_settings/editor_filetypes/Leptava.txt).

## Примеры
В [ruptava](https://github.com/Lime-blur/yoptava/blob/main/example/ruptava), [belptava](https://github.com/Lime-blur/yoptava/blob/main/example/belptava), [goptava](https://github.com/Lime-blur/yoptava/blob/main/example/goptava) и [leptava](https://github.com/Lime-blur/yoptava/blob/main/example/leptava) присутствуют примеры использования массивов, мап, циклов, switch-оператора, а также реализации пакетов, классов и методов.
