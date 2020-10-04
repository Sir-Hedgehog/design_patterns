package ru.patterns.creational.abstractfactory.house;

import ru.patterns.creational.abstractfactory.Architect;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 04.10.2020
 */

public class HouseArchitect implements Architect {
    @Override
    public String plan() {
        return "House architect plans scheme of house!";
    }
}
