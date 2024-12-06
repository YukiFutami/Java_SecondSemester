import java.util.Random;

public class GPT_Exercise09 {
    public static void main(String[] args){

        // 練習問題8: 100までのランダムな偶数
        // 1から100までの範囲で、ランダムに1つの偶数を生成して表示するプログラムを作成してください。

        Random rd = new Random();

        int num = rd.nextInt(100) + 1; //  int num = rd.nextInt(51) * 2;
        if(num % 2 != 0){
            num++;
        }
        System.out.println(num);
    }
}
