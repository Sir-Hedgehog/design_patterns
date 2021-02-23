package ru.patterns.behavioural.patternMethod;

public class IceHockey extends Hockey {
    @Override
    public String setField() {
        return "ice.\n";
    }

    @Override
    public String setSportsShell() {
        return "puck.\n";
    }
}
