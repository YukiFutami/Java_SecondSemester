import java.util.Scanner;

public class exercise005_014 {
    public  static void main(String[] args){

        //  条件分岐（if〜else if〜else文） 014 問題
        // ユーザーから身長（メートル単位）と体重（キログラム単位）を入力として受け取り、BMI値を計算し、BMIに応じて評価を表示するプログラムを作成してください
        //BMIが18.5未満の場合、「低体重」を表示。
        //BMIが18.5以上かつ24.9未満の場合、「正常体重」を表示。
        //BMIが25以上の場合、「肥満」を表示。

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your height(-m): ");
        double height = scan.nextDouble();

        System.out.println("Enter your weight(-kg): ");
        double weight = scan.nextDouble();

        // BMIの計算　Calculating BMI
        double BMI = weight / (height * height);

        //比較
        if (BMI < 18.5)System.out.println("低体重");
        else if (BMI >= 18.5 && BMI < 24.9)System.out.println("正常体重");
        else System.out.println("肥満です");

        scan.close();


    }
}
