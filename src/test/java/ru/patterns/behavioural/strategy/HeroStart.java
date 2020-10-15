package ru.patterns.behavioural.strategy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 3.0
 * @since 15.10.2020
 */

public class HeroStart {
    @Test
    public void checkProtectionOfHero() {
        Hero achilles = new Hero();
        achilles.setActivity(new Protection());
        achilles.takeAction();
        assertThat(achilles.takeAction(), is("Protects the weak people!"));
    }

    @Test
    public void checkSalvationOfHero() {
        Hero hercules = new Hero();
        hercules.setActivity(new Salvation());
        hercules.takeAction();
        assertThat(hercules.takeAction(), is("Save the desperate people!"));
    }

    @Test
    public void checkFightOfHero() {
        Hero jason = new Hero();
        jason.setActivity(new Fight());
        jason.takeAction();
        assertThat(jason.takeAction(), is("Fight against evil!"));
    }
    @Test
    public void checkSleepingOfHero() {
        Hero perseus = new Hero();
        perseus.setActivity(new Sleeping());
        perseus.takeAction();
        assertThat(perseus.takeAction(), is("Sometimes sleeps..."));
    }
}
