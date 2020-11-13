package ru.patterns.behavioural.command;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 13.11.2020
 */

public class Officer {
    private Command defend;
    private Command shoot;
    private Command pump;

    public Officer(Command defend, Command shoot, Command pump) {
        this.defend = defend;
        this.shoot = shoot;
        this.pump = pump;
    }

    public String defendOrder() {
        return defend.act();
    }

    public String shootOrder() {
        return shoot.act();
    }

    public String pumpOrder() {
        return pump.act();
    }
}
