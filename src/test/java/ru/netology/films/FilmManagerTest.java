package ru.netology.films;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test

    public void shouldStart(){

        FilmsManager film = new FilmsManager();

    }

    @Test

    public void shouldInitialSizeArray(){
         FilmsManager film = new FilmsManager(4);
    }
}
