public class class_BitMaskExercise06 {
    public static void main(String[] args){

        // 問題 6: 8ビットのシフト演算
        //c = 0xFF を4ビット右にシフトしてください。その結果を16進数で出力しなさい。

        int c = 0xFF;
        int rightShift = c >> 4;
        System.out.println(Integer.toHexString(rightShift).toUpperCase()); // toUpperCase() 大文字表記にできる！！


    }

}
