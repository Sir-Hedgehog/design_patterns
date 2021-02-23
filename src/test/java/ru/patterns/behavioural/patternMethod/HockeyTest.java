package ru.patterns.behavioural.patternMethod;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 23.02.2021
 */

public class HockeyTest {
    @Test
    public void checkIceHockey() {
        Hockey hockey = new IceHockey();
        String result = "Command game.\n" +
                "Goalkeepers are present.\n" +
                "Field is ice.\n" +
                "Sports shell is puck.\n";
        assertEquals(result, hockey.showFeatures());
    }

    @Test
    public void checkIceHockeyWithBall() {
        Hockey hockey = new IceHockeyWithBall();
        String result = "Command game.\n" +
                "Goalkeepers are present.\n" +
                "Field is ice.\n" +
                "Sports shell is ball.\n";
        assertEquals(result, hockey.showFeatures());
    }

    @Test
    public void checkGreenHockey() {
        Hockey hockey = new GreenHockey();
        String result = "Command game.\n" +
                "Goalkeepers are present.\n" +
                "Field is green field.\n" +
                "Sports shell is ball.\n";
        assertEquals(result, hockey.showFeatures());
    }
}
