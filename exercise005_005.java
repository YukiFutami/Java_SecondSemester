import java.util.Scanner;

public class exercise005_005 {
    public static void main(String[] args){

        //条件分岐（if文） 005 問題
        // ユーザーに整数を入力してもらい、その整数が10未満かどうかを確認し、10未満の場合に「10未満です」と表示するプログラムを書いてください。

        Scanner scan = new Scanner(System.in);
        System.out.println("数を入力: ");
        int value = scan.nextInt();

        if (value < 10){
            System.out.println("10未満です");
        }

        scan.close();
    }
}
