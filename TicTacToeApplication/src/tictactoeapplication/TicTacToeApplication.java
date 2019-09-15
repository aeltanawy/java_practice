/*
 * Copyright 2019 Abeer Eltanawy
 */
package tictactoeapplication;

import java.util.Scanner;

/**
 *
 * @author eltanawy
 */
public class TicTacToeApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        //allow for cont. games
        boolean doYouWantToPlay = true;
        
        while (doYouWantToPlay) {
            System.out.println("Welcome to Tic Tac Tow!\nBut first you mucy pick "
                + "what character you want to be and which character I will be.");
        System.out.println();
        System.out.println("Enter a single character that will represent you on the board");
        char playerToken = sc.next().charAt(0);
        System.out.println("Enter a character that will represent you ropponent on the board");
        char opponentToken = sc.next().charAt(0);
        TicTacToe game = new TicTacToe(playerToken, opponentToken);
        AI ai = new AI();
        
        System.out.println();
        System.out.println("Now we can start out game. To play enter a number and your token shall be out in its place.\n");
        TicTacToe.printIndexBoard();
        System.out.println();
        
        while (game.gameOver().equals("notOver")) {
            if (game.currentMarker == game.userMarker) {
                System.out.println("it is your turn! Enter a spot for your token");
                int spot = sc.nextInt();
                while (!game.playTurn(spot)) {
                    System.out.println("Try again. " + spot + " is invalid. This spot is already taken");
                    spot = sc.nextInt();
                }
                System.out.println("You picked " + spot + "!");
            }else {
                System.out.println("It is my turn");
                int aiSpot = ai.pickSpot(game);
                game.playTurn(aiSpot);
                System.out.println("I picked " + aiSpot);
            }
            System.out.println();
            game.printBoard();
        }
        System.out.println(game.gameOver());
        System.out.println();
        //set up a new game or not
        System.out.println("Do you want to play again? Y/N >");
        char response = sc.next().charAt(0);
        doYouWantToPlay = (response =='Y');
        System.out.println();
        System.out.println();
        }
    }
    
}
