package com.codeName;

public class PlayerCheck {
    private String state = "onGoing";
    private final String[][] board;
    private final String type;

    public PlayerCheck(String[][] newBoard, String newType){
        board = newBoard;
        type = "[" + newType + "]";
    }

    public void axisCheck(){
        int c = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int c6 = 0;
        int plus = 0;
        int minus = board.length-1;

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].equals(type)){
                    c++;
                }
                //fy faen husk det her!!!
                if (board[j][i].equals(type)){
                    c6++;
                }
            }
            if(c == board.length || c6 == board.length) {
                state = "done";
                break;
            }
            else {
                c = 0;
                c6 = 0;
            }
            //Husk at i sånne sitasjoner der du egt vil at alle variablene skall plusses hvis de er sanne, bare bruk if
            //Hvis ikke vil den bare ta den først og gå videre.
            if (board[plus][i].equals(type)) {
                c2++;
            }
            if (board[plus][minus].equals(type)){
                c3++;
            }
            if (board[minus][i].equals(type)){
                c4++;
            }
            if (board[minus][minus].equals(type)){
                c5++;
            }
            plus++;
            minus--;
        }
        if(c2 == board.length || c3 == board.length||c4 == board.length || c5 == board.length) {
            state = "done";
        }
    }

    public String getState(){
        return state;
    }
}
