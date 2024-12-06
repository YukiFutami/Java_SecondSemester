import java.util.Scanner;

public class array5_7 {
    public static void main(String[] args){

        // 練習問題 5 - 7
        // 1 桁の数値（ 1 ～ 9 に限定）を２つ入力し、
        // その積を表示するプログラムを作成しなさい。

        Scanner scan = new Scanner(System.in);

        System.out.print("段: ");
        int dan = scan.nextInt();
        System.out.print("掛ける数: ");
        int kake = scan.nextInt();

        System.out.println(dan + " * " + kake + " = " + (dan * kake));



    }
}
