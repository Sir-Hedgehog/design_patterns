package ru.patterns.behavioural.patternMethod;

public class IceHockeyWithBall extends Hockey {
    @Override
    public String setField() {
        return "ice.\n";
    }

    @Override
    public String setSportsShell() {
        return "ball.\n";
    }
}
