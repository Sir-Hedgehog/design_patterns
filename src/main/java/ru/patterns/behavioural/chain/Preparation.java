package ru.patterns.behavioural.chain;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 02.06.2021
 */

public class Preparation extends Status {

    public Preparation(int movementLevel) {
        super(movementLevel);
    }

    @Override
    public String save(String message) {
        return "Preparation: " + message + "\n";
    }
}
