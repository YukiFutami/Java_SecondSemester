public class class_BitMaskExercise04 {
    public static void main(String[] args){
        // 問題 4: 符号ビット付きの右シフト
        //a = -32 を2ビット右シフトしてください。その結果を10進数で出力しなさい。

        int a = -32;

        int rightShift = a >> 2;

        System.out.println(rightShift);
    }
}
