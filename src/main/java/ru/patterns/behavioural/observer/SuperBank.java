package ru.patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 05.10.2020
 */

public class SuperBank implements Bank {
    private List<String> items = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();

    public void addItem(String item) {
        this.items.add(item);
        notifyClients();
    }

    public void removeItem(String item) {
        this.items.remove(item);
        notifyClients();
    }

    public List<String> getItems() {
        return items;
    }

    @Override
    public void addClient(Client client) {
        this.clients.add(client);
    }

    @Override
    public void removeClient(Client client) {
        this.clients.remove(client);
    }

    @Override
    public void notifyClients() {
        for (Client client : clients) {
            client.getEvent(this.items);
        }
    }

    public List<Client> getClients() {
        return clients;
    }
}
