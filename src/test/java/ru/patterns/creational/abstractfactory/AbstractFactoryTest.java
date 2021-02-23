package ru.patterns.creational.abstractfactory;

import org.junit.Test;
import ru.patterns.creational.abstractfactory.house.HouseTeamFactory;
import ru.patterns.creational.abstractfactory.road.RoadTeamFactory;
import static org.junit.Assert.assertEquals;

public class AbstractFactoryTest {
    @Test
    public void checkWorkingOfHouseTeam() {
        TeamFactory factory = new HouseTeamFactory();
        Architect architect = factory.getArchitect();
        Foreman foreman = factory.getForeman();
        Worker worker = factory.getWorker();
        assertEquals(architect.plan(), "House architect plans scheme of house!");
        assertEquals(foreman.giveDirections(),"House foreman gives directions for builders!");
        assertEquals(worker.work(), "House builder builds house!");
    }

    @Test
    public void  checkWorkingOfRoadTeam() {
        TeamFactory factory = new RoadTeamFactory();
        Architect architect = factory.getArchitect();
        Foreman foreman = factory.getForeman();
        Worker worker = factory.getWorker();
        assertEquals(architect.plan(), "Road architect plans scheme of roads!");
        assertEquals(foreman.giveDirections(), "Road foreman gives directions for builders!");
        assertEquals(worker.work(), "Road builder lays asphalt!");
    }
}
