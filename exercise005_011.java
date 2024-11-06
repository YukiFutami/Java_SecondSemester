import java.util.Scanner;

public class exercise005_011 {
    public static void main(String[] args){

        // 条件分岐（if〜else文） 011 問題
        // ユーザーから年齢を入力として受け取り、飲酒制限に従ったメッセージを表示するプログラムを作成してください。
        //20歳未満の場合、「飲酒は禁止です」を表示。
        //20歳以上の場合、「飲酒は許可されています」を表示。

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        if (age >= 20){ //
            System.out.println("飲酒は許可されています");
        } else {
            System.out.println("飲酒は禁止です");
        }

        scan.close();

    }
}
