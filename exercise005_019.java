import java.util.Scanner;

public class exercise005_019 {
    public static void main(String[] args){

        // 条件分岐（if文のネスト） 019 問題
        // ユーザーに2つの整数を尋ね、以下の条件に基づいてメッセージを表示するプログラムを作成してください。
        // 2つの整数が両方とも正の場合、「両方が正の数です」と表示。
        // 2つの整数のうち1つが正の場合、「1つは正の数です」と表示。 2つの整数が両方とも負の場合、「両方が負の数です」と表示。

        Scanner scan = new Scanner(System.in);
        System.out.println("整数を入力1: ");
        int value1 = scan.nextInt();

        System.out.println("整数を入力2: ");
        int value2 = scan.nextInt();

        if (value1 > 0 && value2 > 0)System.out.println("両方が正の数です");
        // value1 == value2としたが&&のほうが正確 ==だと同じ値ならTrueになってしまう
        else {
            if (value1 < 0 && value2 < 0)System.out.println("両方とも負の数です");
            else if (value1 < 0 || value2 < 0)System.out.println("１つは正の数です");

        /* 正確は以下　そもそも問題を理解してない
        if (value1 > 0 && value2 > 0) {
            System.out.println("両方が正の数です");
        } else if (value1 < 0 && value2 < 0) {
            System.out.println("両方が負の数です");
        } else {
            System.out.println("1つは正の数です");
        }
         */
        }
    }
}


