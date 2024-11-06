import java.util.Scanner;

public class exercise005_026 {
    public static void main(String[] args){

        // 条件分岐（論理演算子） 026 問題
        // ユーザーに数値を尋ね、その数値が10未満または50以上の場合に「条件に合致します」と表示するプログラムを作成してください。


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value");
        int value = scan.nextInt();

        if (value < 10 || value >= 50) {
            System.out.println("条件に合致します");
        } else {
            System.out.println("条件に合致しません");
        }
        scan.close();

    }
}
