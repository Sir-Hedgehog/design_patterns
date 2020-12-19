package ru.patterns.behavioural.memento;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 19.12.2020
 */

public class PcGame {
    private String savingName;
    private String version;

    public void setSaving(String savingName, String version) {
        this.savingName = savingName;
        this.version = version;
    }

    public Storage save() {
        return new Storage(savingName, version);
    }

    public void load(Storage storage) {
        savingName = storage.getSavingName();
        version = storage.getVersion();
    }

    public String getError() {
        return "System error!!!";
    }

    @Override
    public String toString() {
        return "PcGame:"
                + "\nsaveName: " + savingName
                + "\nversion: " + version;
    }
}
