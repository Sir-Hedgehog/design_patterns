package ru.patterns.creational.abstractfactory.house;

import ru.patterns.creational.abstractfactory.Worker;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 04.10.2020
 */

public class HouseBuilder implements Worker {
    @Override
    public String work() {
        return "House builder builds house!";
    }
}
