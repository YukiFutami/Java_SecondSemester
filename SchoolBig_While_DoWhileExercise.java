import java.util.Scanner;

public class SchoolBig_While_DoWhileExercise {
    public static void main(String[] args){

        // while文　ブロックの処理に対して何回繰り返して実行するか最初から決められない場合に使う制御構造
//        while (条件式){
//            ブロック
//        }

        //example
//        int n, sum = 0;
//        int number = 1;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("３より大きい数字を入力する");
//        n = scan.nextInt();
//
//        while (number <= n){
//            sum += number;
//            number += 1;
//        }
//        System.out.println("実行結果: ");
//        System.out.println("1+2+3+...+" + n + "=" + sum);


        // do while文
        // 条件式の方はwhileと同じboolean型
        // whileとの違い do文は繰り返し部分を必ず1回以上実行すること、まずブロック内容を１回実行した後に、
        // 条件式を計算して、ブロックを再度繰り返し実行するかを決定する
        // whileの後にセミコロン;の付け忘れに注意する

        // example
        int n, sum = 0;
        int number = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("３より大きい数字を入力する");
        n = scan.nextInt();

        do{
            sum += number;
            number += 1;
        } while (number <= n);
        System.out.println("実行結果: ");
        System.out.println("1+2+3+...+" + n + "=" + sum);

    }
}
