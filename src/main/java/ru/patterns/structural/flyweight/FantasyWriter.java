package ru.patterns.structural.flyweight;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 14.03.2021
 */

public class FantasyWriter implements Writer {
    boolean isWorked;

    public FantasyWriter(boolean isWorked) {
        this.isWorked = isWorked;
    }

    @Override
    public String writeText() {
        if (!isWorked) {
            isWorked = true;
            return "New fantasy writer starts to work... Do not disturb!";
        }
        return "Fantasy writer writes fantastic tales...";
    }
}
