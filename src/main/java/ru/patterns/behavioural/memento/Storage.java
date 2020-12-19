package ru.patterns.behavioural.memento;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 19.12.2020
 */

public class Storage {
    private final String savingName;
    private final String version;

    public Storage(String savingName, String version) {
        this.savingName = savingName;
        this.version = version;
    }

    public String getSavingName() {
        return savingName;
    }

    public String getVersion() {
        return version;
    }
}
