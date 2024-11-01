public class bitMaskGpt06 {
    public static void main(String[] args){

        // ビットの切り替え 数値 0x4B（10進数で75）の5ビット目（下位から5番目）を1に切り替え、結果を表示しなさい。

        int number = 0x4B;
        System.out.println(Integer.toBinaryString(number));
        // masking
        int mask = 0x10; // 16なので
        System.out.println(Integer.toBinaryString(mask));

        // 切り替え
        int maskedNumber = number | mask;
        System.out.println(maskedNumber);
        System.out.println(Integer.toBinaryString(maskedNumber));

//        int number = 0x4B;  // 修正：0x48 → 0x4B
//        System.out.println("元の数値 (2進数): " + Integer.toBinaryString(number));
//
//        // マスク (5ビット目を1にするマスク)
//        int mask = 0x10;  // 5ビット目を1にするマスク 0b00010000
//        System.out.println("マスク (2進数): " + Integer.toBinaryString(mask));
//
//        // 切り替え
//        int maskedNumber = number | mask;  // OR演算で5ビット目を1にする
//        System.out.println("結果 (10進数): " + maskedNumber);
//        System.out.println("結果 (2進数): " + Integer.toBinaryString(maskedNumber));



    }
}
