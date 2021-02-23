package ru.patterns.behavioural.patternMethod;

public abstract class Hockey {
    private final String command = "Command game.\n";
    private final String goalkeeper = "Goalkeepers are present.\n";
    private final String field = "Field is ";
    private final String sportsShell = "Sports shell is ";

    public String showFeatures() {
        return command +
                goalkeeper +
                field + setField() +
                sportsShell + setSportsShell();
    }

    public abstract String setField();

    public abstract String setSportsShell();
}
