package ru.patterns.behavioural.chain;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OnlineStoreTest {

    @Test
    public void testSaleProcess() {
        Status checking = new Checking(MovementLevel.IN_BASKET);
        Status reserved = new Preparation(MovementLevel.RESERVED);
        Status paid = new Sending(MovementLevel.PAID);

        checking.setNextStatus(reserved);
        reserved.setNextStatus(paid);

        var checkingResult = checking.notifyOperator("The good is absent", MovementLevel.IN_BASKET);
        var reservedResult = checking.notifyOperator("The good is ready to collect", MovementLevel.RESERVED);
        var paidResult = checking.notifyOperator("The good is sent", MovementLevel.PAID);

        assertEquals("Checking: The good is absent\n", checkingResult);
        assertEquals("Checking: The good is ready to collect\nPreparation: The good is ready to collect\n", reservedResult);
        assertEquals("Checking: The good is sent\nPreparation: The good is sent\nSending: The good is sent", paidResult);
    }
}
