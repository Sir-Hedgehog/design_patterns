package ru.patterns.structural.flyweight;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 14.03.2021
 */

public class Novelist implements Writer {
    boolean isWorked;

    public Novelist(boolean isWorked) {
        this.isWorked = isWorked;
    }

    @Override
    public String writeText() {
        if (!isWorked) {
            isWorked = true;
            return "New novelist writer starts to work... Do not disturb!";
        }
        return "Novelist writes amazing novels...";
    }
}
