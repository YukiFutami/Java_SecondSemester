public class exerciseShift01 {
    public static void main(String[] args){

        // GPT 練習問題
        // 問題 1: 左シフト
        //x = 0b0011 を2ビット左にシフトしてください。その結果を10進数で出力しなさい。

        int x =0b0011;

        // シフト
        int leftShift = x << 2;
        System.out.println(leftShift);
        // System.out.println(Integer.toBinaryString(leftShift));
    }
}
