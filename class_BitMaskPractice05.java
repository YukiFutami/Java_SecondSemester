public class class_BitMaskPractice05 {
    public static void main(String[] args){

        // 問題6: ビットを1にする
        //次の数値に対して、特定のビットを1に設定するプログラムを書きなさい。
        //数値: 0xA5（10進数で165）
        //設定したいビット: 7ビット目

        int number = 0xA5;
        System.out.println(Integer.toBinaryString(number));

        int mask = 0x40;
        System.out.println(Integer.toBinaryString(mask));

        int answer = number | mask;
        System.out.println(Integer.toBinaryString(answer));
        System.out.println(answer);

    }
}
