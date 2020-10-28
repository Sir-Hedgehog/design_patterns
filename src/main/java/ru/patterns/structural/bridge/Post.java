package ru.patterns.structural.bridge;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 28.10.2020
 */

public abstract class Post {
    protected Postman postman;

    protected Post(Postman postman) {
        this.postman = postman;
    }

    public abstract String getContain();
}
