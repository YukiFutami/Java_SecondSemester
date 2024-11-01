public class class_BitMaskPractice04 {
    public static void main(String[] args){

        // 問題4: ビットを1にする
        //次の数値に対して、特定のビットを1に設定するプログラムを書きなさい。
        //数値: 0x2A（10進数で42）
        //設定したいビット: 2ビット目

        int number = 0x2A;
        System.out.println(Integer.toBinaryString(number));

        int mask = 0X2;
        System.out.println(Integer.toBinaryString(mask));

        int answer = number | mask; //bitを１にするにはOR演算子、clearするにはAND演算子
        System.out.println(Integer.toBinaryString(answer));
        System.out.println(answer);
    }
}
