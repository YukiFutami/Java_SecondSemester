import java.util.Scanner;

public class exercise005_008 {
    public static void main(String[] args){

        // 条件分岐（if文） 008 問題
        // ユーザーに整数を入力してもらい、その整数が奇数である場合に「奇数です」と表示するプログラムを書いてください。

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        double number = scan.nextDouble();

        if (number % 2 != 0){ // number % 2 == 1 としたほうが良さそう
            System.out.println("奇数です");
        }

        scan.close();

    }

}
