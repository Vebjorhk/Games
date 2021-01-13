package com.codeName;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       var singlePlayer = new SinglePlayer();
       var multiPlayer = new MultiPlayer();
       var input = new Scanner(System.in);

        System.out.println("TIC-TAC-TOE\n-----------\n");
        String game_mode = "";

        while (!game_mode.equals("q")){
            System.out.println("Choose a game mode:");
            System.out.print("1. Single Player:\n2. Multiplayer:\n>");
            game_mode = input.nextLine();
            System.out.println();

            //husk break på switch cases.
            switch (game_mode) {
                case "1":
                    singlePlayer.play();
                    break;
                case "2":
                    multiPlayer.play();
                    break;
                case "help":
                    {
                    System.out.println("-------------------------");
                    System.out.println("Type 1: for Single player");
                    System.out.println("Type 2: for Multiplayer");
                    System.out.println("Type q: to quit");
                    System.out.println("-------------------------\n");
                    break;
                }
                case "q":
                    game_mode = "q";
                    break;
                default:
                    System.out.println("Type 'help' for for a valid command\n");
            }

        }
        System.out.println("Good bye. . .");

    }
}
