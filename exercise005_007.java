import java.util.Scanner;

public class exercise005_007 {
    public static void main(String[] args){

        // 条件分岐（if文） 007 問題
        // ユーザーに2つの文字列を入力してもらい、それらの文字列が同じであるかどうかを確認し、
        // 同じ場合に「同じです」と表示するプログラムを書いてください。

        Scanner scan = new Scanner(System.in);

        System.out.println("value1 = ");
        String value1 = scan.nextLine();

        System.out.println("value2 = ");
        String value2 = scan.nextLine();
        // 間違えた！　esualsメゾッドを使って、比較する
        if (value1.equals(value2))System.out.println("同じです");

        scan.close();
    }
}
