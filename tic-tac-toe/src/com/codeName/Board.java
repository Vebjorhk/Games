package com.codeName;

public class Board {
    private final String[][] board;
    private final int size;

    public Board(int newSize){
        size = newSize;
        board = new String[size][size];
        createBoard();
        drawBoard();
        System.out.println();
    }

    private void createBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "[ ]";
            }
        }
    }

    private void drawBoard(){
        System.out.println();
       for (int i = 0; i < board.length; i++){
           for (int j = 0; j < board[i].length; j++){
               System.out.print(board[i][j]);
           }
           System.out.println();
       }
    }

    public void updateBoard(String type, int[] list){
        board[list[0]][list[1]] = "[" + type.toUpperCase() + "]";
        Counter.updateCounter();
        drawBoard();
        System.out.println(
        );
    }

    public int getsizex2(){
        return size*size;
    }

    public String[][] getBoard(){
        return board;
    }

}
