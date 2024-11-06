import java.util.Scanner;

public class exercise005_029 {
    public static void main(String[] args){

        // 条件分岐（条件演算子） 029 問題
        // ユーザーに整数を尋ね、その整数が奇数か偶数かを表示するプログラムを条件演算子を使用して作成してください。

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value");
        int value = scan.nextInt();

        String result = (value % 2 == 0) ? "偶数です" : "奇数です"; // 出力結果（真偽値）が文字列なのでStringを使う
        System.out.println(result);

        scan.close();
    }

}
