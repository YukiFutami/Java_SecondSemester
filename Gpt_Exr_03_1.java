import java.util.Random;

public class Gpt_Exr_03_1 {
    public static void main(String[] args){

        // 練習問題5: 猫のレース
        // 3匹の猫（A、B、C）が、1から10の範囲でランダムに進んでレースを行います。
        // 10回のターンで猫たちの進み具合を表示し、最初にゴールに到達した猫が勝者となります。
        // ヒント: 3匹の猫それぞれに進み具合を記録して、ゴールを超えるまで進めていきます。

        // 猫の変数
        int cat1, cat2, cat3 = 0;

        //　進む距離を猫ごとにランダムに作成
        Random rd = new Random();
        int distance = rd.nextInt(10) +1;

        // 猫を進ませる
        for(int i = 0; i < 3; i++){

        }

        // ゲーム回数が１０回を迎えたら進みぐあいを表示
        // ゲームカウントが必要
        // ゴールの位置を決め、進んだ距離がゴール値を全ての猫が越えたら終了




    }
}
