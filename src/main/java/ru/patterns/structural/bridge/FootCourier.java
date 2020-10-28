package ru.patterns.structural.bridge;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 28.10.2020
 */

public class FootCourier implements Postman {
    @Override
    public String deliverPost() {
        return "Foot courier delivers post! ";
    }
}
