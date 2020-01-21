package jp.ac.uryukyu.ie.e195758;
import java.util.Scanner;

public class Piece{
    Scanner scan = new Scanner(System.in);
    void piecechoice(){
        System.out.println("動かす駒の縦軸（0~8）を選んでください" );
        String str = scan.next();
        System.out.println(str);
        System.out.println("動かす駒の横軸（0~8）を選んでください");
        String xyz = scan.next();
        System.out.println(xyz);
    }

    void piecemove(){
        System.out.println("動かす場所を選んでください");
        String xpra = scan.next();
        String ypra = scan.next();
    }




}
