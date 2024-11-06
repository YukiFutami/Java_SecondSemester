import java.util.Scanner;

public class exercise005_012 {
    public static void main(String[] args){

        // 条件分岐（if〜else文） 012 問題
        // ユーザーから売上金額を入力として受け取り、ボーナスの計算を行うプログラムを作成してください。
        //売上金額が1000万以上の場合、ボーナス額は売上金額の10%として計算。
        //売上金額が1000万未満の場合、ボーナスは支給されない。

        Scanner scan = new Scanner(System.in);
        System.out.println("売上金額: ");
        long value = scan.nextLong();


        if (value >= 10000000){ // 「もとの金額＋(もとの金額×0.1)」 １０％を求める敷
            // double bonus = value + (value * 0.1); // そもそも支給さ入れているうちの１０％がボーナスなのでこの計算式は違う
            long bonus = (long) Math.floor(value * 0.1);

            System.out.printf("ボーナスの額は: %,d円%n",  bonus , "円");
            System.out.printf("総支給額は: %,d円%n", (value + bonus) , "円");
        } else {
            System.out.println("ボーナスは０円です");
        }
        scan.close();

    }
}
