public class class_BitMaskExercise03 {
    public static void main(String[] args){

        // 問題 3: 論理右シフト
        //z = 0b10000000 を3ビット論理右シフトしてください。その結果を2進数で出力しなさい。

        int z = 0b10000000;

        int shiftRightover = z >>> 3;

        System.out.println(Integer.toBinaryString(shiftRightover));
    }
}
