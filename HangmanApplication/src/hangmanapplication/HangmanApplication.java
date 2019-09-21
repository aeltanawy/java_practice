/*
 * Copyright 2019 Abeer Eltanawy
 */

package hangmanapplication;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author eltanawy
 */


public class HangmanApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Hangman! I will pick a word and you "
                + "will try to guess chacter by character. If you guess wrong 6 times, I win. If "
                + "you can guess it before then, you win. Are you ready!");
        System.out.println();
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay) {
            System.out.println("Let's play!");
            Hangman game = new Hangman();
            
            do {
                System.out.println();
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalCurrentGuess());
                System.out.print(game.mysteryWord);
                System.out.println();
                
                //Get the guess
                System.out.println("Enter a character...");
                char guess = (sc.next().toLowerCase()).charAt(0);
                System.out.println();
                while (game.isGuessedAlready(guess)) {
                    System.out.println("Try again! you have already guessed that character.");
                    guess = (sc.next().toLowerCase()).charAt(0);                    
                }
                
                if (game.playGuess(guess)) {
                    System.out.println("Great guess! That character is in the word");
                } else {
                    System.out.println("unfortunately that character isn't in the word");
                }
                
            }
            while (!game.gameOver());
            
            System.out.println();
            System.out.println("Play again? Y/N");
            Character response = sc.next().toUpperCase().charAt(0);
            doYouWantToPlay = (response == 'Y');
        }
    }
    
}
