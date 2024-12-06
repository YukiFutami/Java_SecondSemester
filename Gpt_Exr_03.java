import java.util.Arrays;
import java.util.Random;

public class Gpt_Exr_03 {
    public static void main(String[] args){

        // 練習問題5: 猫のレース
        // 3匹の猫（A、B、C）が、1から10の範囲でランダムに進んでレースを行います。
        // 10回のターンで猫たちの進み具合を表示し、最初にゴールに到達した猫が勝者となります。
        // ヒント: 3匹の猫それぞれに進み具合を記録して、ゴールを超えるまで進めていきます。

        // 猫３匹の変数 ０地点（スタートにいる）

        int cat1 = 0;
        int cat2 = 0;
        int cat3 = 0;

        int[] cat = {cat1, cat2, cat3};
        System.out.println("スタート: " + Arrays.toString(cat));

        // 一回の移動距離が１～１０
        // 猫ごとに距離をランダムにして、動いたマスを表示する
        Random random = new Random();
        while (true){
            if (cat[0] >= 20 && cat[1] >= 20 && cat[2] >= 20) {
                break;
            } else {
                for(int i = 0; i < cat.length; i++) {
                    for (int j = 0; j < cat.length; j++) {
                        int distance = random.nextInt(10) + 1;

                        cat[j] += distance;
                        System.out.print(j + " = " + distance + "\t");

                        if(cat[0] >= 20 && cat[1] >= 20 && cat[2] >= 20){
                            break;
                        }
                    }
                    System.out.print("それぞれの現在地: " + Arrays.toString(cat));
                    System.out.println();
                }
            }
        }
        // １０ターン目で現在地点を表示
        // ゴールは２０地点とする
        // 最後の猫がゴールに到達したら終了
    }
}
