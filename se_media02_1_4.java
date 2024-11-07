import java.util.Random;
import java.util.Scanner;

public class se_media02_1_4 {
    public static void main(String[] args){

        // じゃんけんゲームを作成してください。
        // ユーザーの手はキーボード入力、PC の手はランダムで決めてください。

        // ユーザーの入力
        Scanner scan = new Scanner(System.in);

        System.out.println("あなたの手を数字で選んでください 0:ぐー 1:ちょき 2:ぱー");
        int userHand = scan.nextInt();

        String hand = switch (userHand){
            case 0 -> "ぐー";
            case 1 -> "ちょき";
            case 2 -> "ぱー";
            default -> "えらー";
        };
        System.out.println("あなたの手は[" + hand + "]");

        // ｐＣ　ランダム
        Random random = new Random();
        int pcHand = random.nextInt(3);

        String Pchand = switch (pcHand){
            case 0 -> "ぐー";
            case 1 -> "ちょき";
            case 2 -> "ぱー";
            default -> "えらー";
        };
        System.out.println("PCの手は[" + Pchand + "]");

        // 勝敗
        String result = "";
        if(userHand == pcHand){
            result = "引き分け";
        } else if ((userHand == 0 && pcHand == 1) ||
                   (userHand == 1 && pcHand == 2) ||
                   (userHand == 2 && pcHand == 0)) {
            result = "あなたの勝ち";
        } else {
            result = "PCの勝ち";
        }
        System.out.println(result + "です");

        scan.close();
    }
}
