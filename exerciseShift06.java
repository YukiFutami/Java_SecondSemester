public class exerciseShift06 {
    public static void main(String[] args){

        // GPT練習問題
        // 問題 6: 8ビットのシフト演算
        // c = 0xFF を4ビット右にシフトしてください。その結果を16進数で出力しなさい。

        int c = 0xFF;

        //シフト
        int rightShift = c >> 4;

        // 出力　16進数
        System.out.println(Integer.toHexString(rightShift));
    }
}
