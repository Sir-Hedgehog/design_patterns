package ru.patterns.behavioural.memento;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 19.12.2020
 */

public class GameTest {
    @Test
    public void checkProtectionOfHero() {
        PcGame game = new PcGame();
        Options options = new Options();

        game.setSaving("Lvl 1. The attack of monsters", "1.0");
        options.setStorage(game.save());
        assertThat(game.toString(), is("PcGame:"
                + "\nsaveName: Lvl 1. The attack of monsters"
                + "\nversion: 1.0"));

        game.setSaving("Lvl 1. Try to avoid of the attack", "1.1");
        assertThat(game.toString(), is("PcGame:"
                + "\nsaveName: Lvl 1. Try to avoid of the attack"
                + "\nversion: 1.1"));
        assertThat(game.getError(), is("System error!!!"));

        game.load(options.getStorage());
        assertThat(game.toString(), is("PcGame:"
                + "\nsaveName: Lvl 1. The attack of monsters"
                + "\nversion: 1.0"));
    }
}
