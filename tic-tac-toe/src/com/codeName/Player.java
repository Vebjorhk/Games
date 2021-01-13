package com.codeName;

import java.util.Scanner;

public class Player {
    private final Scanner input = new Scanner(System.in);
    private final String[][] board;
    private final String symbol;

    public Player(String[][] playerBoard, String newSymbol){
        board = playerBoard;
        symbol = newSymbol;

    }

    public int[] playerAction(){
        System.out.println(symbol + "'s turn, please give dimensions");
        while (true){
            System.out.print("Row: ");
            int row = input.nextInt()-1;
            System.out.print("Col: ");
            int col = input.nextInt()-1;
            int[] list = {row, col};
            System.out.println();

            if (row < board.length && col < board.length && board[row][col].equals("[ ]")){
                return list;
            }
            else
                System.out.println("Denne plassen er opptatt eller er en ugyldig indeks!");
        }
    }

    public String getSymbol(){
        return symbol;
    }

}
