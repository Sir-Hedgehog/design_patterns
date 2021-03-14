package ru.patterns.structural.flyweight;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 14.03.2021
 */

public class EssayTest {

    @Test
    public void checkAllWritersWorking() {
        String fantasyStart = "New fantasy writer starts to work... Do not disturb!";
        String fantasyActivity = "Fantasy writer writes fantastic tales...";
        String novelStart = "New novelist writer starts to work... Do not disturb!";
        String novelActivity = "Novelist writes amazing novels...";

        WriterFactory factory = new WriterFactory();
        List<Writer> all = List.of(
                factory.getWriterBySpecialty("novel"),
                factory.getWriterBySpecialty("novel"),
                factory.getWriterBySpecialty("novel"),
                factory.getWriterBySpecialty("fantasy"),
                factory.getWriterBySpecialty("fantasy"),
                factory.getWriterBySpecialty("novel"),
                factory.getWriterBySpecialty("novel"),
                factory.getWriterBySpecialty("fantasy"),
                factory.getWriterBySpecialty("fantasy"),
                factory.getWriterBySpecialty("fantasy")
        );

        for (int index = 0; index < all.size(); index++) {
            switch (index) {
                case 0:
                    assertEquals(all.get(index).writeText(), novelStart);
                    break;
                case 3:
                    assertEquals(all.get(index).writeText(), fantasyStart);
                    break;
                case 1:
                case 2:
                case 5:
                case 6:
                    assertEquals(all.get(index).writeText(), novelActivity);
                    break;
                case 4:
                case 7:
                case 8:
                case 9:
                    assertEquals(all.get(index).writeText(), fantasyActivity);
                    break;
            }
        }
    }
}
