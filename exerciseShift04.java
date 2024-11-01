public class exerciseShift04 {
    public static void main(String[] args){

        // GPT練習問題
        // 問題 4: 符号ビット付きの右シフト
        // a = -32 を2ビット右シフトしてください。その結果を10進数で出力しなさい。

        int a = -32;

        // シフト
        int rightShift = a >> 2;

        // 出力　１０進数
        System.out.println(rightShift);
    }
}
