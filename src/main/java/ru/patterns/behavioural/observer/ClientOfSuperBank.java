package ru.patterns.behavioural.observer;

import java.util.List;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 05.10.2020
 */

public class ClientOfSuperBank implements Client {
    private String name;

    public ClientOfSuperBank(String name) {
        this.name = name;
    }

    @Override
    public String getEvent(List<String> items) {
        return "Dear " + name + ",\n we changed items:\n" + items
                + "\n==========================================\n";
    }

    public String getName() {
        return name;
    }
}
