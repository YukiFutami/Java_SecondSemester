import java.util.Random;

public class GPT_Exercise06 {
    public static void main(String[] args){

        // 練習問題5: ランダムな名前を選ぶ
        // 以下の名前リストからランダムに1つの名前を選び、その名前を表示するプログラムを作成してください。
        //
        // "John", "Alice", "Bob", "Charlie", "David"

        Random rd = new Random();
        String[] name = {"John", "Alice", "Bob", "Charlie", "David"};

        int pickName = rd.nextInt(name.length);
        System.out.println(name[pickName]);


    }
}
