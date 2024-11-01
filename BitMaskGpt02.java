public class BitMaskGpt02 {
    public static void main(String[] args){

        // 問題2 : ビットマスクの演算
        //次の16進数の値に対してビットAND演算を行い、その結果を10進数で表示しなさい。
        //A = 0xFF00FF00   B = 0x00FF00FF
//
//        int a = 0xFF00FF00;
//        int b = 0x00FF00FF;
//
//        int answer = a & b;
//        System.out.println("問題２の答えは: " + answer);
//
//        // 問題３ : 特定のビットを設定
//        // 次の数値に対して、特定のビットを1に設定するプログラムを書きなさい。
//        // 具体的には、0x4A（10進数で74）の4ビット目を1に設定しなさい。
//
//        int fan = 0x4A;
//        System.out.println(Integer.toBinaryString(fan));
//        // マスク
//        int mask = 0x10 ; //2の4乗だから１０　２進数では１６＝１０進数では１０
//        System.out.println(Integer.toBinaryString(mask));
//
//        //合わせる
//        int maskedfan = fan | mask; // 特定のビットは１のままにしたいのでOR演算子
//        System.out.println(Integer.toBinaryString(maskedfan));

        // 問題４ : 特定のビットをクリア????????????????????????????
        //次の数値に対して、特定のビットをクリアするプログラムを書きなさい。
        // 具体的には、0xF0（10進数で240）の3ビット目をクリアしなさい。

        int fan4 = 0xF0;

        // ３ビット目をクリア（０）
        int mask4 = ~0xF8;

        int maskdfan4 = fan4 & mask4;
        System.out.println(maskdfan4);
        System.out.println(Integer.toBinaryString(maskdfan4));



    }
}
