package ru.patterns.behavioural.chain;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 02.06.2021
 */

public class Checking extends Status {

    public Checking(int movementLevel) {
        super(movementLevel);
    }

    @Override
    public String save(String message) {
        return "Checking: " + message + "\n";
    }
}
