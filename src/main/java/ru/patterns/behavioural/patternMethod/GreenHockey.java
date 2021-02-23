package ru.patterns.behavioural.patternMethod;

public class GreenHockey extends Hockey {
    @Override
    public String setField() {
        return "green field.\n";
    }

    @Override
    public String setSportsShell() {
        return "ball.\n";
    }
}
