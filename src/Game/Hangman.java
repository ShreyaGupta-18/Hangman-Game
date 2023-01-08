package Game;

import java.io.FileNotFoundException;

public class Hangman {
    public static void main(String[] args) throws FileNotFoundException {
        ReadWords gameservice = new ReadWords();
        gameservice.start();
    }
}
