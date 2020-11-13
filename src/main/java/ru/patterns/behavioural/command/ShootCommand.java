package ru.patterns.behavioural.command;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 13.11.2020
 */

public class ShootCommand implements Command {

    private Army army;

    public ShootCommand(Army army) {
        this.army = army;
    }

    @Override
    public String act() {
        return army.shoot();
    }
}
