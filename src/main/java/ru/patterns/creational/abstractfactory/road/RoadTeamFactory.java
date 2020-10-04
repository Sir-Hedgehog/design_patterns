package ru.patterns.creational.abstractfactory.road;

import ru.patterns.creational.abstractfactory.Architect;
import ru.patterns.creational.abstractfactory.Foreman;
import ru.patterns.creational.abstractfactory.TeamFactory;
import ru.patterns.creational.abstractfactory.Worker;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 04.10.2020
 */

public class RoadTeamFactory implements TeamFactory {
    @Override
    public Architect getArchitect() {
        return new RoadArchitect();
    }

    @Override
    public Foreman getForeman() {
        return new RoadForeman();
    }

    @Override
    public Worker getWorker() {
        return new RoadBuilder();
    }
}
