package ru.patterns.behavioural.memento;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

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
        assertEquals(game.toString(),"PcGame:"
                + "\nsaveName: Lvl 1. The attack of monsters"
                + "\nversion: 1.0");

        game.setSaving("Lvl 1. Try to avoid of the attack", "1.1");
        assertEquals(game.toString(),"PcGame:"
                + "\nsaveName: Lvl 1. Try to avoid of the attack"
                + "\nversion: 1.1");
        assertEquals(game.getError(),"System error!!!");

        game.load(options.getStorage());
        assertEquals(game.toString(),"PcGame:"
                + "\nsaveName: Lvl 1. The attack of monsters"
                + "\nversion: 1.0");
    }
}
