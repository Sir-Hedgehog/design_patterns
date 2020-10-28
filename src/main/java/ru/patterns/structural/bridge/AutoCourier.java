package ru.patterns.structural.bridge;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 28.10.2020
 */

public class AutoCourier implements Postman {
    @Override
    public String deliverPost() {
        return "Auto courier drives post! ";
    }
}
