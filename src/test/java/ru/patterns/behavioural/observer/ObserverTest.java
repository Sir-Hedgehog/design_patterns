package ru.patterns.behavioural.observer;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 05.10.2020
 */

public class ObserverTest {
    @Test
    public void checkAddEvent() {
        SuperBank superBank = new SuperBank();
        superBank.addItem("Credit is 10% per year.");
        superBank.addItem("Mortgage is 12% per year.");
        ClientOfSuperBank firstClient = new ClientOfSuperBank("Maria Dbko");
        ClientOfSuperBank secondClient = new ClientOfSuperBank("Postgre Sqlko");
        superBank.addClient(firstClient);
        superBank.addClient(secondClient);
        superBank.addItem("Contribution is 7% per year.");
        String firstResult = superBank.getClients().get(0).getEvent(superBank.getItems());
        String firstExpected = "Dear " + firstClient.getName()
                + ",\n we changed items:\n[Credit is 10% per year., Mortgage is 12% per year., Contribution is 7% per year.]"
                + "\n==========================================\n";
        String secondResult = superBank.getClients().get(1).getEvent(superBank.getItems());
        String secondExpected = "Dear " + secondClient.getName()
                + ",\n we changed items:\n[Credit is 10% per year., Mortgage is 12% per year., Contribution is 7% per year.]"
                + "\n==========================================\n";
        assertEquals(firstResult, firstExpected);
        assertEquals(secondResult, secondExpected);
    }

    @Test
    public void checkRemoveEvent() {
        SuperBank superBank = new SuperBank();
        superBank.addItem("Credit is 10% per year.");
        superBank.addItem("Mortgage is 12% per year.");
        ClientOfSuperBank firstClient = new ClientOfSuperBank("Maria Dbko");
        ClientOfSuperBank secondClient = new ClientOfSuperBank("Postgre Sqlko");
        superBank.addClient(firstClient);
        superBank.addClient(secondClient);
        superBank.removeItem("Credit is 10% per year.");
        String firstResult = superBank.getClients().get(0).getEvent(superBank.getItems());
        String firstExpected = "Dear " + firstClient.getName()
                + ",\n we changed items:\n[Mortgage is 12% per year.]"
                + "\n==========================================\n";
        String secondResult = superBank.getClients().get(1).getEvent(superBank.getItems());
        String secondExpected = "Dear " + secondClient.getName()
                + ",\n we changed items:\n[Mortgage is 12% per year.]"
                + "\n==========================================\n";
        assertEquals(firstResult, firstExpected);
        assertEquals(secondResult, secondExpected);
    }
}
