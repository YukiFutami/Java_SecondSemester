import java.util.Scanner;

public class exercise005_028 {
    public static void main(String[] args){

        // 条件分岐（条件演算子） 028 問題
        // ユーザーに2つの整数を尋ね、それらの整数のうち大きい方を表示するプログラムを条件演算子を使用して作成してください。

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value 1");
        int value1 = scan.nextInt();

        System.out.println("Enter value 2");
        int value2 = scan.nextInt();

        int result = (value1 > value2) ? value1 : value2; // 条件式 = condition ? true　value : false value;
        System.out.println(result);

    }
}
