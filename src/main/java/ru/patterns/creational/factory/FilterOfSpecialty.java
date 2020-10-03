package ru.patterns.creational.factory;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 03.10.2020
 */

public class FilterOfSpecialty {
    public SportsAcademy filter(String sports) {
        SportsAcademy academy;
        if (sports.equalsIgnoreCase("football")) {
            academy = new FootballFaculty();
        } else if (sports.equalsIgnoreCase("basketball")) {
            academy = new BasketballFaculty();
        } else {
            throw new RuntimeException("Our sports academy doesn't prepare sportsmen of such type");
        }
        return academy;
    }
}
