public class bitMaskGpt04 {
    public static void main(String[] args){

        // 偶数か奇数かの判定
        // 与えられた数が偶数か奇数かをビット演算子を使って判定するプログラムを書きなさい。
        // 数値: 45

        int number = 45;

        // 偶数か奇数かの判定
        if (number % 2 == 0){
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }

        // 上はただの算数演算子
        // Bit演算子は下

        if ((number & 1) == 0){
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }

    }
}
