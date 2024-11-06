import java.util.Scanner;

public class exercise006_0014 {
    public static void main(String[] args){

        // 006 繰り返し（while文） 014 問題
        // while文を使用して、ユーザーが0を入力するまでの整数を受け取り、それらの整数の合計を表示するプログラムを作成してください。

        Scanner scan = new Scanner(System.in);

        // ループの回数を計算
//        int sum = 0;
//
//        while (true){
//            System.out.println("整数を入力してください: ");
//            int userInput = scan.nextInt();
//            //もし０が入力されたらbreakしてループの抜け出し、０でないならsumに１追加し再度ループ
//            if (userInput == 0){
//                System.out.println("０が入力されました、whileを止めます");
//                break;
//            } else {
//                sum += userInput;
//            }
//        }
//        System.out.println("合計は:" + sum + "です");
//
//        scan.close();

        // whileをもっと簡潔にできる　trueとbreakを使わない方法
        int sum = 0;
        int userInput; //宣言

        System.out.println("整数を入力してください: ");

        while ((userInput = scan.nextInt()) != 0){
            sum += userInput;
            System.out.println("現在の合計" + sum);
        }

        System.out.println("０が入力されました");
        System.out.println("合計は: " + sum + "です");

        scan.close();
    }
}
