import java.util.Random;

public class exercise004_035 {
    public static void main(String[] args){

        // ランダムな整数を要素数として持つ整数型の配列を宣言し、初期化してください。
        // その後、各要素数を出力するプログラムを作成してください。

        Random random = new Random();

        int rd = random.nextInt(10) + 1;
        int[] rdArray = new int[rd];

        System.out.println(rdArray.length);
    }
}
