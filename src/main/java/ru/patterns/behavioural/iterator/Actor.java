package ru.patterns.behavioural.iterator;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 08.04.2021
 */

public class Actor implements Collection {
    private String name;
    private String[] films;

    public Actor(String name, String[] films) {
        this.name = name;
        this.films = films;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getFilms() {
        return films;
    }

    public void setFilms(String[] films) {
        this.films = films;
    }

    @Override
    public Iterator getIterator() {
        return new FilmIterator();
    }

    private class FilmIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < films.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return films[index++];
        }
    }
}
