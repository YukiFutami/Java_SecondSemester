import javax.swing.plaf.BorderUIResource;

public class exerciseShift07 {
    public static void main(String[] args){

        // GPT練習問題
        // 問題 7: シフトを使った簡単な乗算
        // d = 5 を3ビット左にシフトしてみてください。この結果はdを何倍にしたことになりますか？ その結果を10進数で出力しなさい。

        int d = 5;

        // シフト
        int number = d << 3;

        // 何倍か？
        int multiplier = number / 5;

        //出力
        System.out.println(number);
        System.out.println("dの倍数: " + multiplier);


    }
}
