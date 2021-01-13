package com.codeName;

public class MultiPlayer {

    public void play(){
        var board = new Board(3);
        var player1 = new Player(board.getBoard(), "X");
        var player2 = new Player(board.getBoard(), "O");
        var player1Check = new PlayerCheck(board.getBoard(), player1.getSymbol());
        var player2Check = new PlayerCheck(board.getBoard(), player2.getSymbol());
        String winner = "";

        while (true){
            board.updateBoard(player1.getSymbol(), player1.playerAction());
            player1Check.axisCheck();
            if (player1Check.getState().equals("done")){
                winner = player1.getSymbol();
                break;
            }
            else if (Counter.getCounter() == board.getsizex2()){
                break;
            }
            board.updateBoard(player2.getSymbol(), player2.playerAction());
            player2Check.axisCheck();
            if (player2Check.getState().equals("done")){
                winner = player2.getSymbol();
                break;
            }
        }

        if (!winner.equals("")){
            System.out.println("The winner is: " + winner + "\n");
        }
        else{
            System.out.println("No one wins!" + "\n");
        }
    }
}
