package ru.patterns.behavioural.observer;

import java.util.List;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 05.10.2020
 */

public interface Client {
    String getEvent(List<String> items);
}
