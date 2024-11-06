import java.util.Scanner;

public class exercise005_031 {
    public static void main(String[] args){

        // 条件分岐（条件演算子） 031 問題
        // ユーザーにテストの点数を尋ね、点数が90以上なら「優秀」、80以上90未満なら「良好」、70以上80未満なら「可」、
        // それ以下なら「不可」と表示するプログラムを条件演算子を使用して作成してください。

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your exam score");
        int examScore = scan.nextInt();

        String result = (examScore >= 90) ? "優秀" :
                        (examScore >= 80) ? "良好" :
                        (examScore >= 70) ? "可" :
                                            "不可";
        /*
        result = (condition1) ? value1 :
                 (condition2) ? value2 :
                 (condition3) ? value3 :
                                defaultValue; (false値)
         int max =  (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c); このやり方もある
         */

        System.out.println(result);

        scan.close();

    }
}
