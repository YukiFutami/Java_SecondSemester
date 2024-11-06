import java.util.Scanner;

public class exercise005_003 {
    public static void main(String[] args){

        // 条件分岐（if文） 003 問題
        // ユーザーから整数を受け取り、その整数が3の倍数である場合に「3の倍数です」と表示するプログラムを書いてください。

        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하라");
        int num = scan.nextInt();

        if (num % 3 == 0){
            System.out.println("3의 배수입니다");
        }

        // 別の方法　ステートメントが１行なのでかっこを省略できる
        if (num % 3 == 0)System.out.println("3の倍数です");
        else System.out.println("3の倍数ではありません。");

        scan.close();
    }
}
