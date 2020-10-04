package ru.patterns.creational.abstractfactory.road;

import ru.patterns.creational.abstractfactory.Architect;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 04.10.2020
 */

public class RoadArchitect implements Architect {
    @Override
    public String plan() {
        return "Road architect plans scheme of roads!";
    }
}
