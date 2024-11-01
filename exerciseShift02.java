public class exerciseShift02 {
    public static void main(String[] args){

        // GPT練習問題
        // 問題 2: 右シフト
        //y = 0b1100 を1ビット右にシフトしてください。その結果を2進数で出力しなさい。

        int y = 0b1100;

        // シフト
        int rightShift = y >> 1;

        // 出力　２進数
        System.out.println(Integer.toBinaryString(rightShift));
    }
}
