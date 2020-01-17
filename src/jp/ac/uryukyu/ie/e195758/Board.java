package jp.ac.uryukyu.ie.e195758;

public class Board {

    void Board(){
       char[][] board = {{'|','銀','|','王','|','金','|'},{'|','　','|','歩','|','　','|'},{'|','　','|','歩','|','　','|'},{'|','銀','|','王','|','金','|'}};
        for(int i = 0; i < 4; i++){
            System.out.println(board[i]);
        }
    }
}