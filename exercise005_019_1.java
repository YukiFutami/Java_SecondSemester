import java.util.Scanner;

public class exercise005_019_1 {
    public static void main(String[] args){

        // 条件分岐（if文のネスト） 019 問題
        //ユーザーに2つの整数を尋ね、以下の条件に基づいてメッセージを表示するプログラムを作成してください。
        //2つの整数が両方とも正の場合、「両方が正の数です」と表示。
        //2つの整数のうち1つが正の場合、「1つは正の数です」と表示。 2つの整数が両方とも負の場合、「両方が負の数です」と表示。

        Scanner scan = new Scanner(System.in);

        System.out.println("整数1: ");
        int num1 = scan.nextInt();

        System.out.println("整数2: ");
        int num2 = scan.nextInt();

        if (num1 > 0 && num2 > 0){
            System.out.println("両方が正の数です");
        } else if (num1 > 0 || num2 > 0) {
            System.out.println("1つは正の数です");
        } else {
            System.out.println("両方とも負の数です");
        }
        scan.close();
    }
}
/* GPTのコード　０の判定を追加している
import java.util.Scanner;

public class exercise005_019_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("整数1: ");
        int num1 = scan.nextInt();

        System.out.println("整数2: ");
        int num2 = scan.nextInt();

        // 条件分岐
        if (num1 > 0 && num2 > 0) {
            System.out.println("両方が正の数です");
        } else if (num1 < 0 && num2 < 0) {
            System.out.println("両方とも負の数です");
        } else if (num1 == 0 || num2 == 0) {
            System.out.println("1つまたは両方の入力が0です");
        } else {
            System.out.println("1つは正の数です");
        }

        scan.close();  // Scannerのリソース解放
    }
}
 */