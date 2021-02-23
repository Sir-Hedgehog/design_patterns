package ru.patterns.behavioural.command;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CommandTest {
    @Test
    public void checkProtectionOfHero() {
        Army army = new Army();
        Officer officer = new Officer(
                new DefendCommand(army),
                new ShootCommand(army),
                new PumpCommand(army)
        );
        assertEquals(officer.defendOrder(),"Defend homeland!");
        assertEquals(officer.shootOrder(),"Shoot the target!");
        assertEquals(officer.pumpOrder(),"Pump muscles!");
    }
}
