package ru.limedev.example.example_custom;

import ru.limedev.example.example_custom.settings.CustomSettings;
import ru.limedev.yoptava.Yoptava;
import ru.limedev.yoptava.settings.abstraction.YoptavaSettings;

public class Main {

    private static final YoptavaSettings customSettings = new CustomSettings();

    public static void main(String[] args) {
        Yoptava.init(customSettings);
    }
}
