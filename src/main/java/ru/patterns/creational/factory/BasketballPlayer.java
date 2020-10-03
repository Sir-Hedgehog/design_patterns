package ru.patterns.creational.factory;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 03.10.2020
 */

public class BasketballPlayer implements Sportsman {
    @Override
    public String sport() {
        return "Basketball player throws ball into the ring!";
    }
}
