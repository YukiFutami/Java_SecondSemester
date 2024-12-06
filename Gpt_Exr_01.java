import java.util.Random;
import java.util.Scanner;

public class Gpt_Exr_01 {
    public static void main(String[] args){

        // 練習問題1: 複数回のじゃんけん
        // プレイヤーに「じゃんけん」を複数回（例えば5回）行ってもらい、その結果を表示します。
        // 勝ち数、負け数、引き分け数をカウントし、最終的な勝者（最も多く勝った回数）を表示してください。
        // ヒント: ループと条件分岐を使って、結果をカウントします。

        // ユーザーの入力
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();

        String level = "";

        while(true){
            System.out.println("Enter your hand: ");
            String userHand = scan.nextLine().toLowerCase();

            int userHandNum = switch (userHand){
                case "scissor" -> 0;
                case "paper" -> 1;
                case "rock" -> 2;
                default -> -1;
            };

            System.out.println(userHandNum);

            // PCの入力　ランダム
            String[] hand = {"Scissor", "Paper", "Rock"};
            int cpHand = rd.nextInt(hand.length);
            System.out.println(hand[cpHand]);

            // 勝敗の判定

            if(userHandNum == cpHand){
                level = "Draw";
            }


            // 上記を繰り返す５回

            // 最終的な勝者を出力



        }

    }
}
