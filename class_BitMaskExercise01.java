public class class_BitMaskExercise01 {
    public static void main(String[] args){

        // 問題 1: 左シフト
        //x = 0b0011 を2ビット左にシフトしてください。その結果を10進数で出力しなさい。

        int x = 0b0011;

        int leftShift = x << 2;

        System.out.println(leftShift);
        System.out.println(Integer.toBinaryString(leftShift));
    }
}
