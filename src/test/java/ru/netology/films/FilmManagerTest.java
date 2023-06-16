package ru.netology.films;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test

    public void shouldFindAll() {

        MovieManager manager = new MovieManager();

        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");

        String[] expected = {"film 1", "film 2", "film 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {

        MovieManager manager = new MovieManager();

        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");

        String[] expected = {"film 3", "film 2", "film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void souldFindAllLimit() {
        MovieManager manager = new MovieManager(2);

        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");

        String[] expected = {"film 3", "film 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastLimit() {
        MovieManager manager = new MovieManager(3);

        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");
        manager.add("film 4");

        String[] expected = {"film 4", "film 3", "film 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
