import java.util.Scanner;

public class GPT_Exercise01 {
    public static void main(String[] args){

        // 三項演算子を使用する問題
        // 問題: ユーザーから3つの整数を入力させ、その中で最も大きい整数を表示するプログラムを作成してください。
        // 三項演算子を使用して実装してください。
        //要件:
        //ユーザーに3つの整数（a, b, c）を入力してもらう。
        //三項演算子を使用して、最も大きい整数を計算する。
        //計算した結果を表示する。
        // 例: 最大値 = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value 1");
        int value1 = scan.nextInt();

        System.out.println("Enter value 2");
        int value2 = scan.nextInt();

        System.out.println("Enter value 3");
        int value3 = scan.nextInt();

        int max = (value1 > value2 ) ? (value1 > value3 ? value1 : value3) : ((value2 > value3) ? value2 : value3);
        System.out.println("最大値は" + max);

        scan.close();
    }
}
