import java.util.Scanner;

public class exercise005_001 {
    public static void main(String[] args){

        // 条件分岐（if文） 001 問題
        // ユーザーから整数を受け取り、その整数が正の数である場合に「正の数です」と表示するプログラムを書いてください。

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int number = scanner.nextInt();

        if (number > 0 ){
            System.out.println("양수입니다");
        } // else {
            //System.out.println("음수입니다");
//        }


    }
}
