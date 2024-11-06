import java.util.Scanner;

public class exercise005_012_1 {
    public static void main(String[] args){

        // 2回目 条件分岐（if〜else文） 012 問題
        // ユーザーから売上金額を入力として受け取り、ボーナスの計算を行うプログラムを作成してください。
        //売上金額が1000万以上の場合、ボーナス額は売上金額の10%として計算。
        //売上金額が1000万未満の場合、ボーナスは支給されない。

        Scanner scan = new Scanner(System.in);

        System.out.println("売上金額を入力: ");
        long value = scan.nextLong();

        if (value >= 10000000){
            double bonus = value * 0.10;
            System.out.println("売上金額は: " + value);
            System.out.println("ボーナスは: " + bonus);
        } else {
            System.out.println("ボーナスは０です");
        }

        scan.close();
    }
}
/*
import java.util.Scanner;

public class SalesBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("売上金額を入力してください: ");
        double salesAmount = scanner.nextDouble();

        double bonus = 0.0;

        if (salesAmount >= 10000000) {
            // 売上金額が1000万以上の場合、ボーナスは売上金額の10%として計算
            bonus = salesAmount * 0.10;
        }

        System.out.println("ボーナス額: " + bonus);

        scanner.close();
    }
}
 */
