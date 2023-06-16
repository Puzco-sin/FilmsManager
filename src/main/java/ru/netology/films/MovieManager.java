package ru.netology.films;

public class MovieManager {

    private String[] movies = new String[0];
   private int limit;

    MovieManager() {
         this.limit = 10;
    }

    MovieManager(int limit) {
        this.limit = limit;
    }

    public void add(String movie) {
        String[] newMovie = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            newMovie[i] = movies[i];
        }
        newMovie[newMovie.length - 1] = movie;
        movies = newMovie;

    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}