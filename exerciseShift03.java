public class exerciseShift03 {
    public static void main(String[] args){

        // GPT練習問題
        // 問題 3: 論理右シフト
        //z = 0b10000000 を3ビット論理(無符号？）右シフトしてください。その結果を2進数で出力しなさい。

        int z = 0b10000000;

        // シフト
        int rightShift = z >>> 3;

        // 出力　２進数
        System.out.println(Integer.toBinaryString(rightShift));



    }
}
