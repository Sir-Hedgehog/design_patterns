package ru.patterns.behavioural.strategy;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 15.10.2020
 */

public class Fight implements Activity {
    @Override
    public String performFeat() {
        return "Fight against evil!";
    }
}
