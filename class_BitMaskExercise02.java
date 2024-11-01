public class class_BitMaskExercise02 {
    public static void main(String[] args){

        //問題 2: 右シフト
        // y = 0b1100 を1ビット右にシフトしてください。その結果を2進数で出力しなさい。

        int y = 0b1100;

        int rightShift = y >> 1;

        System.out.println(Integer.toBinaryString(rightShift));

    }
}
