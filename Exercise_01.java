import java.util.Random;
import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args){

        //練習問題3: 数当てゲーム
        //コンピュータが1から100の範囲でランダムな数を選び、プレイヤーにその数を当てさせるゲームを作ります。
        //プレイヤーが数を入力し、コンピュータは「もっと大きい」「もっと小さい」「正解」と答えます。
        //プレイヤーが正解を当てるまで繰り返します。
        //ヒント: プレイヤーの入力を受け取り、ランダムで選ばれた数と比較して結果を表示します。


        // cpランダム値
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int cpNum = random.nextInt(100) + 1;

        // ユーザーの入力
        int userNum;
        // 条件式　（cpの数を当てる）
        while (true){
            System.out.println("数字を入力: ");
            userNum = scan.nextInt();

            if(cpNum == userNum){
                break;
            } else if (cpNum > userNum) {
                System.out.println("もっと大きい");
            } else {
                System.out.println("もっと小さい");
            }
        }
        System.out.println("CP Value: " + cpNum + " User Value: " + userNum);
        System.out.println("正解");

    }
}
