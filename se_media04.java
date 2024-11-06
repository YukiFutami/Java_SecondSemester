import java.util.Scanner;

public class se_media04 {
    public static void main(String[] args){

        // 問題 4 難易度 ★
        //入園料表示プログラムを作成してください。
        //① 子供は一人 500 円、大人は一人 1000 円として計算してください。
        Scanner sc = new Scanner(System.in);

        System.out.println("いらっしゃいませ、お名前を入力してください");
        String name = sc.nextLine();

        System.out.println("大人の人数を入力してください");
        int adult = sc.nextInt();
        int adultValue = adult * 1000;

        System.out.println("子供の人数を入力してください");
        int kids = sc.nextInt();
        int kidsValue = kids * 500;

        System.out.println(name + "様、合計料金は" + (adultValue + kidsValue) + "円です。" );

        sc.close();
    }
}
