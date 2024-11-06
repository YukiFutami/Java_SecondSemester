import java.util.Scanner;

public class exercise005_006 {
    public static void main(String[] args){

        // 条件分岐（if文） 006 問題
        // ユーザーから整数を受け取り、その整数が100以上の場合に「100以上です」と表示するプログラムを書いてください。

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = scan.nextInt();

        if (number >= 100)System.out.println("１００以上です");

        scan.close();
    }
}
