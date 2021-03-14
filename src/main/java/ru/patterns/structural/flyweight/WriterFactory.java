package ru.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 14.03.2021
 */

public class WriterFactory {
    private static final Map<String, Writer> writers = new HashMap<>();

    public Writer getWriterBySpecialty(String specialty) {
        Writer writer = writers.get(specialty);

        if (Objects.isNull(writer)) {
            switch (specialty) {
                case "novel":
                    writer = new Novelist(false);
                    break;
                case "fantasy":
                    writer = new FantasyWriter(false);
            }
            writers.put(specialty, writer);
        }

        return writer;
    }
}
