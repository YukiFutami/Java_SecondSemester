import java.util.Scanner;

public class exercise005_030 {
    public static void main(String[] args){

        // 条件分岐（条件演算子） 030 問題
        // ユーザーにテストの点数を尋ね、その点数が80以上なら「合格」、
        // それ以下なら「不合格」と表示するプログラムを条件演算子を使用して作成してください。

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your exam score");
        float examScore = scan.nextFloat();

        String result = (examScore >= 80) ? "合格" : "不合格";
        System.out.println(result);

        scan.close();
    }
}
