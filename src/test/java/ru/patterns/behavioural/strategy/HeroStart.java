package ru.patterns.behavioural.strategy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 15.10.2020
 */

public class HeroStart {
    @Test
    public void checkDifferentActivitiesOfHero() {
        Hero achilles = new Hero();
        achilles.setActivity(new Protection());
        achilles.takeAction();
        assertThat(achilles.takeAction(), is("Protects the weak people!"));
        achilles.setActivity(new Salvation());
        achilles.takeAction();
        assertThat(achilles.takeAction(), is("Save the desperate people!"));
        achilles.setActivity(new Fight());
        achilles.takeAction();
        assertThat(achilles.takeAction(), is("Fight against evil!"));
        achilles.setActivity(new Sleeping());
        achilles.takeAction();
        assertThat(achilles.takeAction(), is("Sometimes sleeps..."));
    }
}
