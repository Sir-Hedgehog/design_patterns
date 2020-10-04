package ru.patterns.creational.abstractfactory;

import org.junit.Test;
import ru.patterns.creational.abstractfactory.house.HouseTeamFactory;
import ru.patterns.creational.abstractfactory.road.RoadTeamFactory;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AbstractFactoryTest {
    @Test
    public void checkWorkingOfHouseTeam() {
        TeamFactory factory = new HouseTeamFactory();
        Architect architect = factory.getArchitect();
        Foreman foreman = factory.getForeman();
        Worker worker = factory.getWorker();
        assertThat(architect.plan(), is("House architect plans scheme of house!"));
        assertThat(foreman.giveDirections(), is("House foreman gives directions for builders!"));
        assertThat(worker.work(), is("House builder builds house!"));
    }

    @Test
    public void  checkWorkingOfRoadTeam() {
        TeamFactory factory = new RoadTeamFactory();
        Architect architect = factory.getArchitect();
        Foreman foreman = factory.getForeman();
        Worker worker = factory.getWorker();
        assertThat(architect.plan(), is("Road architect plans scheme of roads!"));
        assertThat(foreman.giveDirections(), is("Road foreman gives directions for builders!"));
        assertThat(worker.work(), is("Road builder lays asphalt!"));
    }
}
