package ru.patterns.behavioural.memento;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 19.12.2020
 */

public class Options {
    private Storage storage;

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Storage getStorage() {
        return storage;
    }
}
