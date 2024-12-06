import java.util.Random;

public class GPT_Exercise08 {
    public static void main(String[] args){

        //練習問題7: ランダムな2つの数の合計
        //1から100までの2つのランダムな整数を生成し、その合計を計算して表示するプログラムを作成してください。

        Random rd = new Random();

        int value1 = rd.nextInt(100) + 1;
        int value2 = rd.nextInt(100) + 1;

        int total = value1 + value2;
        System.out.println(value1 + "+" + value2 + "=" + total);
    }
}
