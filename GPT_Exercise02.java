import java.util.Random;

public class GPT_Exercise02 {
    public static void main(String[] args){

        // 練習問題1: 1から10までのランダムな整数を生成
        // 1から10までのランダムな整数を生成し、その値を表示するプログラムを作成してください。

        Random random = new Random();

        for(int i = 1; i <= 10; i++){
            int num = random.nextInt(10) + 1;
            System.out.print(num);
        }


        for(int j = 1; j <= 10; j++){
            int value = (int)(Math.random() * 10);
            System.out.print(value);
        }

    }
}
