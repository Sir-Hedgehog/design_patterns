package ru.patterns.behavioural.command;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CommandTest {
    @Test
    public void checkProtectionOfHero() {
        Army army = new Army();
        Officer officer = new Officer(
                new DefendCommand(army),
                new ShootCommand(army),
                new PumpCommand(army)
        );
        assertThat(officer.defendOrder(), is("Defend homeland!"));
        assertThat(officer.shootOrder(), is("Shoot the target!"));
        assertThat(officer.pumpOrder(), is("Pump muscles!"));
    }
}
