import java.util.Scanner;

public class exercise005_018 {
    public static void main(String[] args){

        //条件分岐（if文のネスト） 018 問題
        // ユーザーに2つの整数を尋ね、以下の条件に基づいて比較メッセージを表示するプログラムを作成してください。
        // 2つの整数が等しい場合、「同じ値です」と表示。 2つの整数が異なる場合、大きい方の整数を表示。

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Value 1: ");
        int value1 = scan.nextInt();

        System.out.println("Enter Value 2: ");
        int value2 = scan.nextInt();

        if (value1 == value2){
            System.out.println("同じ値です");
        } else {
            if (value1 > value2){
                System.out.println("大きいのは: " + value1 + "です");
            } else {
                System.out.println("大きいのは: " + value2 + "です");
            }
        }
        scan.close(); // 複数回の入力では必要ない、閉じない場合が良いときもある
    }
}
