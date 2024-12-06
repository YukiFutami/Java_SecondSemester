import java.util.Random;

public class GPT_Exercise05 {
    public static void main(String[] args){

        // 練習問題4: サイコロを振る
        // 6面のサイコロを1回振って、1から6の整数をランダムに生成し、その結果を表示するプログラムを作成してください。
        Random random = new Random();

        int num = random.nextInt( 6) + 1;
        System.out.println(num);

    }
}
