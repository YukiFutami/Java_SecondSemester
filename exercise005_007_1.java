import java.util.Scanner;

public class exercise005_007_1 {
    public static void main(String[] args){

        // ２回目　条件分岐（if文） 007 問題
        // ユーザーに2つの文字列を入力してもらい、それらの文字列が同じであるかどうかを確認し、
        // 同じ場合に「同じです」と表示するプログラムを書いてください。

        Scanner scan = new Scanner(System.in);

        System.out.println("文字列の入力1: ");
        String char1 = scan.nextLine();

        System.out.println("文字列の入力2: ");
        String char2 = scan.nextLine();

        if (char1.equals(char2))System.out.println("同じです");
        else System.out.println("違います");

        scan.close();
    }
}
