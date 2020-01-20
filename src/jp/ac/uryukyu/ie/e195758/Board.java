package jp.ac.uryukyu.ie.e195758;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private String[] board[] = new String[9][9];
    private String num;

    public Board(String unit){
        this.num = unit;
        for(int i=0; i<9; i++){
            board[i] = new String[]{unit,unit,unit,unit,unit,unit,unit,unit,unit};
        }
        for(int r=0;r<9; r++){
            board[0][r] = " と";
        }
        for(int t=0;t<9; t++){
            board[8][t] = " 歩";
        }



    }
    void showBoard(){
        System.out.println("　A  B  C  D  E F  G  H  I ");
        for(int i=0; i<9; i++){
            System.out.println(i + board[i][0] + board[i][1] + board[i][2] + board[i][3] + board[i][4] + board[i][5] + board[i][6] + board[i][7] + board[i][8]);
        }
        System.out.println("\n");



    }

}