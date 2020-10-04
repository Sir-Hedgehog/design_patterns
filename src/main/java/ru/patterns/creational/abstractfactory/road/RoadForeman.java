package ru.patterns.creational.abstractfactory.road;

import ru.patterns.creational.abstractfactory.Foreman;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 04.10.2020
 */

public class RoadForeman implements Foreman {
    @Override
    public String giveDirections() {
        return "Road foreman gives directions for builders!";
    }
}
