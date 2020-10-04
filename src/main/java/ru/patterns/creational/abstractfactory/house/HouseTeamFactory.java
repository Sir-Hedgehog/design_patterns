package ru.patterns.creational.abstractfactory.house;

import ru.patterns.creational.abstractfactory.Architect;
import ru.patterns.creational.abstractfactory.Foreman;
import ru.patterns.creational.abstractfactory.TeamFactory;
import ru.patterns.creational.abstractfactory.Worker;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 04.10.2020
 */

public class HouseTeamFactory implements TeamFactory {
    @Override
    public Architect getArchitect() {
        return new HouseArchitect();
    }

    @Override
    public Foreman getForeman() {
        return new HouseForeman();
    }

    @Override
    public Worker getWorker() {
        return new HouseBuilder();
    }
}
