import java.util.Random;

public class GPT_Exercise07 {
    public static void main(String[] args){

        //練習問題6: ランダムな色を選ぶ
        //以下の色（赤、青、緑）からランダムに1色を選んで、その色の名前を表示するプログラムを作成してください。
        //"Red", "Blue", "Green"

        Random rd = new Random();
        String[] color = {"Red", "Blue", "Green"};

        int pickNum = rd.nextInt(color.length);
        System.out.println(color[pickNum]);

    }
}
