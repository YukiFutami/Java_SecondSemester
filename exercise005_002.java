import java.util.Scanner;

public class exercise005_002 {
    public static void main(String[] args){

        // 条件分岐（if文） 002 問題
        // ユーザーから整数を受け取り、その整数が偶数である場合に「偶数です」と表示するプログラムを書いてください。

        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력헤라 : ");
        int number = scanner.nextInt();

        if ( number % 2 == 0){
            System.out.println("양수예요");
        }

        scanner.close();
    }
}
