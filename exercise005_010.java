import java.util.Scanner;

public class exercise005_010 {
    public static void main(String[] args){

        // 条件分岐（if〜else文） 010 問題
        // ユーザーから正の整数を入力として受け取り、その整数が偶数か奇数かを判定するプログラムを作成してください。

        Scanner scan = new Scanner(System.in);
        System.out.print("正の数を入れてください");
        int num = scan.nextInt();

        // 正の数か確認
        if (num > 0){
            if (num % 2 == 0){
                System.out.println("偶数です");
            } else {
                System.out.println("奇数です");
            }
        } else {
            System.out.println("正の数ではありません");
        }
        scan.close();

    }
}
