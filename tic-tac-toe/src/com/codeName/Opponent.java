package com.codeName;

import java.util.Random;

public class Opponent {
    private final String[][] board;
    private final String symbol;
    private final Random rand = new Random();


    public Opponent(String[][] newBoard, String newSymbol){
        board = newBoard;
        symbol = newSymbol;
    }

    public int[] opponentStartPosition(){
        while (true){
            int row = rand.nextInt(board.length);
            System.out.println(row);
            int col = rand.nextInt(board.length);
            System.out.println(col);
            if (board[row][col].equals("[ ]")) {
                return new int[] {row, col};
            }
        }
    }

    public String getSymbol(){
        return symbol;
    }
}
