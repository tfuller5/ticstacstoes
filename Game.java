package tictactoe;

import java.util.Random;
import java.util.Scanner;

public class Game {
    /*
    everything is an object (except the primtive types)
    objects have methods
    methods, can be void, or they can return something

    returning something means
    the method collapses (transforms) into the returned value


     */
    private void IamVoid() {

    }

    private String giveword() {
        return "Hello";
    }

    private int rand() {
        int generated = (new Random()).nextInt(50);
        return generated;
    }

    public void game() {

        IamVoid();
        System.out.println(giveword());
        String hello = giveword();
        String firstjava = giveword() + " world";
        System.out.println(firstjava);
        rand();
        rand();
        // 10 + a method?
        int sum = 10 + rand() + 5 * rand() * rand();




        Board board = new Board();
        //print a welcome message
        System.out.println("Welcome to Tic Tac Toe");

        //create a new Player object
        Player player1 = new Player();
        player1.setPlayerId("1");
        System.out.println("Your player ID is " + player1);

        //scanner object
        Scanner scanner = new Scanner(System.in);

//        System.out.println(player1 + " You must enter a position\n > between " +
//                board.displayBoard(3, 3));

        System.out.println(player1 + " You must enter a position\n > between " +
                board.displayBoard(3, 3));
        scanner.nextLine();


        //display a board
        board.displayBoard(3, 3);
    }
}
