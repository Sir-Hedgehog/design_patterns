package ru.patterns.behavioural.strategy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 2.0
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
        Hero achilles = new Hero();
        achilles.setActivity(new Salvation());
        achilles.takeAction();
        assertThat(achilles.takeAction(), is("Save the desperate people!"));
    }

    @Test
    public void checkFightOfHero() {
        Hero achilles = new Hero();
        achilles.setActivity(new Fight());
        achilles.takeAction();
        assertThat(achilles.takeAction(), is("Fight against evil!"));
    }
    @Test
    public void checkSleepingOfHero() {
        Hero achilles = new Hero();
        achilles.setActivity(new Sleeping());
        achilles.takeAction();
        assertThat(achilles.takeAction(), is("Sometimes sleeps..."));
    }
}
