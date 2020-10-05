package ru.patterns.structural.decorator;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 05.10.2020
 */

public class Recruiter implements HrManager {
    @Override
    public String work() {
        return "Calls candidates. ";
    }
}
