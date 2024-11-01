public class class_BitMaskPractice03 {
    public static void main(String[] args){

        //問題3: ビットをクリアする
        //次の数値に対して、特定のビットをクリアするプログラムを書きなさい。
        //数値: 0x7F（10進数で127）
        //クリアしたいビット: 6ビット目

        int number = 0x7F;
        System.out.println(Integer.toBinaryString(number));

        // masking 4bitに分けて、１オクテットはすべて０なので０，２オクテットは右から２ビットを１にしたいので２にする
        int mask = ~(0x20);
        System.out.println(Integer.toBinaryString(mask));

        // 合わせる
        int asewer = number & mask;
        System.out.println(Integer.toBinaryString(asewer));
        System.out.println(asewer);

    }
}
