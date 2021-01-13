package com.codeName;

public class SinglePlayer {

    public void play(){
        var board = new Board(3);
        var player = new Player(board.getBoard(), "X");
        var opponent = new Opponent(board.getBoard(), "O");
        var playerCheck = new PlayerCheck(board.getBoard(), player.getSymbol());
        var opponentCheck = new PlayerCheck(board.getBoard(), opponent.getSymbol());
        String winner = "";

        while (true){
            board.updateBoard(player.getSymbol(), player.playerAction());
            playerCheck.axisCheck();
            if (playerCheck.getState().equals("done")){
                winner = player.getSymbol();
                break;
            }
            else if (Counter.getCounter() == board.getsizex2()){
                break;
            }
            board.updateBoard(opponent.getSymbol(), opponent.opponentStartPosition());
            opponentCheck.axisCheck();
            if (opponentCheck.getState().equals("done")){
                winner = opponent.getSymbol();
                break;
            }
        }

        if (!winner.equals("")){
            System.out.println("The winner is: " + winner + "\n");
        }
        else{
            System.out.println("No one wins!\n");
        }
    }
}
