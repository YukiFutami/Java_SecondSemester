public class class_BitMaskPractice01 {
    public static void main(String[] args){

        //問題1: ビットをクリアする
        //次の数値に対して、特定のビットをクリアするプログラムを書きなさい。
        //数値: 0xC3（10進数で195）
        //クリアしたいビット: 1ビット目

        int number = 0xC3;
        System.out.println(Integer.toBinaryString(number));

        //masking １ビット目をクリアしたいので反転 見づらいので0xFFで桁合わせ
        int mask = ~(0x1) & 0xFF;
        System.out.println(Integer.toBinaryString(mask));

        // 合わせる
        int answer = number & mask;
        System.out.println(Integer.toBinaryString(answer));
        System.out.println(answer);

    }
}
