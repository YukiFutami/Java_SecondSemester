public class bitMaskGpt03 {
    public static void main(String[] args){
        // ビットの反転
        // 次の数値に対して、すべてのビットを反転させるプログラムを書いてください。
        // 数値: 0x3C（10進数で60）
        // 反転後の結果を10進数で表示しなさい。

        int number = 0x3C;

        // 反転
        int notNumber = ~number;

        // 出力　１０進数
        System.out.println(notNumber);
    }
}
