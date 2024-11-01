public class bitMaskGpt07 { //////////////////////////////////
    public static void main(String[] args){

//        // 問題4: 特定のビットをクリア
//        // 次の数値に対して、特定のビットをクリアするプログラムを書きなさい。
//        // 具体的には、0xF0（10進数で240）の3ビット目をクリアしなさい。
//
//        int number = 0xF0;
//        System.out.println(Integer.toBinaryString(number));
//
//        // masking
//        int mask = 0xF7;
//        System.out.println(mask);
//        System.out.println(Integer.toBinaryString(mask));
//
//        // awaseru
//        int masked = number & mask;
//        System.out.println(masked);
//        System.out.println(Integer.toBinaryString(masked));

            // 問題4: 特定のビットをクリア
            // 次の数値に対して、特定のビットをクリアするプログラムを書きなさい。
            // 具体的には、0xF0（10進数で240）の3ビット目をクリアしなさい。

            int number = 0xF0; // 240
            System.out.println("元の数値 (2進数): " + Integer.toBinaryString(number));

            // 3ビット目をクリアするためのマスクを作成 (0xF7)
            int mask = 0xF7; // 3ビット目が0、他は1
            System.out.println("マスク (10進数): " + mask);
            System.out.println("マスク (2進数): " + Integer.toBinaryString(mask));

            // ビットをクリア
            int masked = number & mask; // 3ビット目をクリア
            System.out.println("クリア後の数値 (10進数): " + masked);
            System.out.println("クリア後の数値 (2進数): " + Integer.toBinaryString(masked));


    }
}
