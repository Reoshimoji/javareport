package jp.ac.uryukyu.ie.e195758;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Board b = new Board("　");
        b.showBoard();

        Piece p = new Piece();
        p.piecechoice();
        p.piecemove();

        b.showBoard();





    }
}
