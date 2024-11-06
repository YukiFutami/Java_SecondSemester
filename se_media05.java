import java.util.Scanner;

public class se_media05 {
    public static void main(String[] args){

        // 問題 5 難易度 ★★
        //① 消費税込みの金額を計算するプログラムを作成してください
        //　 (税込み金額は小数点以下切り捨てで表示してください。)

        Scanner scan = new Scanner(System.in);

        System.out.println("金額を入力してください");
        int value = scan.nextInt();

        System.out.println("消費税率のパーセント値を整数で入力してください");
        int tax = scan.nextInt();

        System.out.println("税込み金額は、" + (value * (100 + tax) / 100) + "円です");

        scan.close();

    }
}
