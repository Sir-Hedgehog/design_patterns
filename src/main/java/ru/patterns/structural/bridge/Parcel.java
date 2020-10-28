package ru.patterns.structural.bridge;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 28.10.2020
 */

public class Parcel extends Post {

    public Parcel(Postman postman) {
        super(postman);
    }

    @Override
    public String getContain() {
        return postman.deliverPost() + "The parcel will be delivered very quickly!";
    }
}
