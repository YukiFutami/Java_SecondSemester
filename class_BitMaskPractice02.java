public class class_BitMaskPractice02 {
    public static void main(String[] args){

        // 問題2: ビットを1にする
        //次の数値に対して、特定のビットを1に設定するプログラムを書きなさい。
        //数値: 0x5A（10進数で90）
        //設定したいビット: 5ビット目

        int number = 0x5A;

        // masking 5ビット目を１に設定
        int mask = 0x10;
        System.out.println(Integer.toBinaryString(mask));

        // 合わせる 1を残したいのでOR演算子
        int maskedNumber = number | mask;
        System.out.println(Integer.toBinaryString(maskedNumber));
        System.out.println(maskedNumber);
    }
}
// すべにびっとが１なので、出力結果が変わらない！
