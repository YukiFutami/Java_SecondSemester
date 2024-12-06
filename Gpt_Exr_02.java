import java.util.Random;

public class Gpt_Exr_02 {
    public static void main(String[] args){

        Random rd = new Random();
        // 練習問題2: ビンゴゲーム
        // 5×5のビンゴカードを作成し、1から75までの番号からランダムに番号を引きます。引いた番号がビンゴカードにあれば、その番号を消します。
        // すべての番号が揃ったとき、ビンゴ達成と表示します。
        // ヒント: 2次元配列を使ってビンゴカードを管理し、ランダムに番号を引いてチェックします。

        //　ビンゴカード
        int bingoCard = 0;
        // ビンゴカードのサイズ
        int cardSize = 5;

        // 自分のカードを表示し、数字を確認する
        for(int i = 0; i < cardSize; i++){
            for (int j = 0; j < cardSize; j++){
                int baseBingoNum = rd.nextInt(75) + 1; // ランダムに番号を与える
                bingoCard = baseBingoNum;
                System.out.printf("%2d\t" , bingoCard );
            }
            System.out.println();
        }

        // カードを引き、同じ数字があれば、ビンゴカードから消す（＊にする）
        int checkCard = rd.nextInt(75) + 1;
        System.out.println("カード番号" + checkCard);



        // 揃ったらビンゴ達成
        // ゲーム回数３０回までやったら終了



    }
}
