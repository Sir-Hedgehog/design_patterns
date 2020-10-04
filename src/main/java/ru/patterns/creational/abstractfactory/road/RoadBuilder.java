package ru.patterns.creational.abstractfactory.road;

import ru.patterns.creational.abstractfactory.Worker;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 04.10.2020
 */

public class RoadBuilder implements Worker {
    @Override
    public String work() {
        return "Road builder lays asphalt!";
    }
}
