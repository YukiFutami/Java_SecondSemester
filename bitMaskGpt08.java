public class bitMaskGpt08 {
    public static void main(String[] args){

        // 問題5: ビットシフトとマスキング
        // 次の16進数の値を右に4ビットシフトし、その結果を2進数で表示しなさい。
        // C = 0xABCD1234

//        int c = 0xABCD1234;
//
//        // shift
//        int rightshift = c >> 4;
//
//        // output 2進数
//        System.out.println(Integer.toBinaryString(rightshift));

//        int c = 0xABCD1234;
//
//        // shift
//        int rightshift = c >> 4;
//
//        // output 2進数
//        System.out.println(Integer.toBinaryString(rightshift));
//        System.out.println(rightshift); // 10進数も表示

        int c = 0xABCD1234;

        // shift
        int rightshift = c >>> 4;

        // output 2進数
        System.out.println("右シフト結果 (2進数): " + Integer.toBinaryString(rightshift));
        System.out.println("右シフト結果 (10進数): " + rightshift); // 10進数も表示

    }
}
