package ru.patterns.behavioural.strategy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 3.0
 * @since 15.10.2020
 */

public class HeroTest {
    @Test
    public void checkProtectionOfHero() {
        Hero achilles = new Hero();
        achilles.setActivity(new Protection());
        achilles.takeAction();
        assertEquals(achilles.takeAction(),"Protects the weak people!");
    }

    @Test
    public void checkSalvationOfHero() {
        Hero hercules = new Hero();
        hercules.setActivity(new Salvation());
        hercules.takeAction();
        assertEquals(hercules.takeAction(), "Save the desperate people!");
    }

    @Test
    public void checkFightOfHero() {
        Hero jason = new Hero();
        jason.setActivity(new Fight());
        jason.takeAction();
        assertEquals(jason.takeAction(),"Fight against evil!");
    }
    @Test
    public void checkSleepingOfHero() {
        Hero perseus = new Hero();
        perseus.setActivity(new Sleeping());
        perseus.takeAction();
        assertEquals(perseus.takeAction(),"Sometimes sleeps...");
    }
}
