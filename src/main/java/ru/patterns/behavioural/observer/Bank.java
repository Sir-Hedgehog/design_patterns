package ru.patterns.behavioural.observer;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 05.10.2020
 */

public interface Bank {
    void addClient(Client client);
    void removeClient(Client client);
    void notifyClients();
}
