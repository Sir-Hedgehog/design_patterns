package ru.patterns.creational.factory;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 03.10.2020
 */

public class FactoryTest {

    @Test
    public void checkSpecialtyOfFootballPlayerInSportsAcademy() {
        FilterOfSpecialty filterOfSpecialty = new FilterOfSpecialty();
        SportsAcademy academy = filterOfSpecialty.filter("football");
        Sportsman sportsman = academy.preparesSportsman();
        assertEquals(sportsman.sport(), "Football player kicks ball into the goal!");
    }

    @Test
    public void  checkSpecialtyOfBasketballPlayerInSportsAcademy() {
        FilterOfSpecialty filterOfSpecialty = new FilterOfSpecialty();
        SportsAcademy academy = filterOfSpecialty.filter("basketball");
        Sportsman sportsman = academy.preparesSportsman();
        assertEquals(sportsman.sport(), "Basketball player throws ball into the ring!");
    }

    @Test
    public void checkUnknownSpecialtyOfPlayerInSportsAcademy() {
        FilterOfSpecialty filterOfSpecialty = new FilterOfSpecialty();
        try {
            filterOfSpecialty.filter("tennis");
        } catch (RuntimeException expected) {
            assertEquals("Our sports academy doesn't prepare sportsmen of such type", expected.getMessage());
        }
    }
}
