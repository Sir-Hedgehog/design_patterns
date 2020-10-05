package ru.patterns.structural.decorator;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 05.10.2020
 */

public class DecoratorHrManager implements HrManager {

    private HrManager hrManager;

    public DecoratorHrManager(HrManager hrManager) {
        this.hrManager = hrManager;
    }

    @Override
    public String work() {
        return hrManager.work();
    }
}
