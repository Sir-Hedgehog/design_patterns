package ru.patterns.behavioural.iterator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 08.04.2021
 */

public class ActorTest {

    @Test
    public void checkFilmsOfBradPitt() {
        int counter = 0;
        String[] films = {"Allied", "Troy", "Snatch", "The Mexican", "Babel"};

        Actor actor = new Actor("Brad Pitt", films);
        Iterator iterator = actor.getIterator();

        assertEquals("Brad Pitt", actor.getName());

        while (iterator.hasNext()) {
            assertEquals(iterator.next().toString(), films[counter++]);
        }
    }
}
