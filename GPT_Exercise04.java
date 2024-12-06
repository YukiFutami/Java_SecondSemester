import java.util.Random;

public class GPT_Exercise04 {
    public static void main(String[] args){

        // 練習問題3: ランダムな文字を生成
        // AからZまでのアルファベットの中からランダムに1文字を選んで表示してください。

        Random random = new Random();


        int num = random.nextInt(26);
        char alp = (char) ('A' + num);
        System.out.println(alp);


    }
}
