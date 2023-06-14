package ru.netology.films;

public class MovieManager {
    private String[] movies;
    private int countLast;

    private static final int COUNT_LAST_DEFAULT = 10;

    MovieManager() {
        this(COUNT_LAST_DEFAULT);
    }

    MovieManager(int countLast) {
        this.countLast = countLast;
        movies = new String[0];
    }

    public void add(String movie) {
        if (movies.length == 0) {
            movies = new String[1];
            movies[0] = movie;
        } else {
            String[] movieNew = new String[movies.length + 1];
            for (int i = 0; i < movies.length; i++) {
                movieNew[i] = movies[i];
            }
            movieNew[movies.length] = movie;
            movies = movieNew;
        }
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int countLast = movies.length > this.countLast ? this.countLast : movies.length;
        if (countLast == 0) {
            return new String[0];
        }
        String[] result = new String[countLast];
        for (int i = movies.length - countLast; i < movies.length; i++) {
            result[i - movies.length + countLast] = movies[i];
        }
        return result;
    }
}