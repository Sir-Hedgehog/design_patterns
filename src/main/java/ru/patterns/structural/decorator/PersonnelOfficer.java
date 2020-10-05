package ru.patterns.structural.decorator;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 05.10.2020
 */

public class PersonnelOfficer extends DecoratorHrManager {
    public PersonnelOfficer(HrManager hrManager) {
        super(hrManager);
    }

    private String keepWorkbooks() {
        return "Keeps workbooks. ";
    }

    @Override
    public String work() {
        return super.work() + keepWorkbooks();
    }
}
