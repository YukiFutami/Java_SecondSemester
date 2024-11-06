import java.util.Scanner;

public class exercise005_009 {
    public static void main(String[] args){

        // 条件分岐（if〜else文） 009 問題
        // ユーザーからテストの点数を入力として受け取り、以下の評価を行うプログラムを作成してください。
        //80以上の場合、「合格」を表示。
        //79点以下の場合、「不合格」を表示。

        Scanner scan = new Scanner(System.in);
        System.out.println("テストの点数を入力してください");
        float score = scan.nextFloat();

        if (score >= 80){
            System.out.print("合格です");
        } else {
            System.out.println("不合格です");
        }

        scan.close();

    }
}
