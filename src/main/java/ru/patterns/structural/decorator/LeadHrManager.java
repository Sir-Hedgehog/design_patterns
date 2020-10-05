package ru.patterns.structural.decorator;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 05.10.2020
 */

public class LeadHrManager extends DecoratorHrManager {

    public LeadHrManager(HrManager hrManager) {
        super(hrManager);
    }

    private String interview() {
        return "Interviews. ";
    }

    @Override
    public String work() {
        return super.work() + interview();
    }
}
