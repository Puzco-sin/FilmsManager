package ru.netology.films;

public class main {
    public static void main(String[] args) {
        MovieManager movieManager = new MovieManager(2);

        movieManager.add("Парк Юрского периода");
        movieManager.add("Терминатор 2");
        movieManager.add("Титаник");

        System.out.println("-----Выводим все фильмы-----");
        String[] movies = movieManager.findAll();
        for (int i = 0; i < movies.length; i++) System.out.println(movies[i]);

        System.out.println("-----Выводим последние два фильма-----");
        movies = movieManager.findLast();
        for (int i = 0; i < movies.length; i++) System.out.println(movies[i]);

    }
}
