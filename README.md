# Yoptava

[![yoptava logo](https://github.com/Lime-blur/yoptava/blob/main/images/yoptava.png)](https://github.com/Lime-blur/yoptava/)

[![yoptava](https://img.shields.io/badge/%D0%A1%D0%BA%D0%B0%D1%87%D0%B0%D1%82%D1%8C-Yoptava-green)](https://github.com/Lime-blur/yoptava/archive/refs/heads/main.zip)
[![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)](https://github.com/Lime-blur/yoptava/issues)
[![yoptava license](https://img.shields.io/github/license/Lime-blur/yoptava)](https://github.com/Lime-blur/yoptava/blob/main/LICENSE)

Yoptava — это первый в мире язык программирования на русском языке, транслируемый в Java с помощью Runtime компилятора. Yoptava позволяет выбрать определённую лексику для программирования, например:

- [ruptava](https://github.com/Lime-blur/yoptava/blob/main/ruptava/Load.ruptava) — классический язык программирования Java на русском языке
- [goptava](https://github.com/Lime-blur/yoptava/blob/main/goptava/Load.goptava) — язык программирования Java для гопников и реальных пацанов, основанный на [YoptaScript](http://yopta.space/)
- [leptava](https://github.com/Lime-blur/yoptava/blob/main/leptava/Load.leptava) — язык программирования Java использующий старославянскую лексику

## Разработка

Вся разработка и поиск ошибок ведётся в ветке [**develop**](https://github.com/Lime-blur/yoptava/tree/develop)!
При разработке языка использовался язык программирования [YoptaScript](http://yopta.space/), а также [Словарь старославянских слов](https://hogwarts.ru/library/show.php?cat=1&id=39503&uid=guest).

## Предупреждения

Yoptava была реализована всего за несколько дней и не является серьёзной разработкой.
Yoptava не несёт в себе цели оскорбить кого-то или унизить. Yoptava содержит **множество нецензурной лексики**.

## Использование

- Скачайте [последнюю версию](https://github.com/Lime-blur/yoptava/archive/refs/heads/main.zip) языка
- Установите Java SDK в Project Structure. Минимальная версия Java SDK — 1.8
- Внесите нужные настройки в файле [YoptavaSettings](https://github.com/Lime-blur/yoptava/blob/main/src/main/java/ru/limedev/yoptava/settings/YoptavaSettings.java)
- Приступайте к написанию кода [ruptava](https://github.com/Lime-blur/yoptava/blob/main/ruptava/Load.ruptava), [goptava](https://github.com/Lime-blur/yoptava/blob/main/goptava/Load.goptava) или [leptava](https://github.com/Lime-blur/yoptava/blob/main/leptava/Load.leptava), в зависимости от выставленных настроек

## Проблемы

- Yoptava поддерживает только компиляцию класса `Load`. Очень **приветствуется** доработка языка под компиляцию дерева `.goptava`, `.ruptava`, `.leptava` файлов
- Также **приветствуется** упрощение парсинга файлов в классе [YoptavaParser](https://github.com/Lime-blur/yoptava/blob/main/src/main/java/ru/limedev/yoptava/parser/YoptavaParser.java)

## Добавление собственного словаря

Имеется возможность добавить свой собственный словарь Yoptava. Для этого необходимо:

- В пакете [dictionary](https://github.com/Lime-blur/yoptava/tree/main/src/main/java/ru/limedev/yoptava/parser/dictionary) создать новый класс, например:
```Java
public class MyptavaDictionary implements Dictionary {

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
- Добавить созданный класс как новый тип языка в [LanguageType](https://github.com/Lime-blur/yoptava/blob/main/src/main/java/ru/limedev/yoptava/settings/LanguageType.java):
```Java
MYPTAVA(".myptava", new MyptavaDictionary())
```
- Создать новую папку `myptava` в корне проекта
- В [YoptavaSettings](https://github.com/Lime-blur/yoptava/blob/main/src/main/java/ru/limedev/yoptava/settings/YoptavaSettings.java) изменить константы LANGUAGE_TYPE и SOURCES_DIRECTORY:
```Java
public static final LanguageType LANGUAGE_TYPE = LanguageType.MYPTAVA;

..

public static final String SOURCES_DIRECTORY = "myptava";
```

## Примеры
В файлах [ruptava](https://github.com/Lime-blur/yoptava/blob/main/ruptava/Load.ruptava), [goptava](https://github.com/Lime-blur/yoptava/blob/main/goptava/Load.goptava) и [leptava](https://github.com/Lime-blur/yoptava/blob/main/leptava/Load.leptava) присутствуют примеры использования массивов, циклов, switch-оператора, а также реализации методов. **Приветствуется** дополнение примеров.
