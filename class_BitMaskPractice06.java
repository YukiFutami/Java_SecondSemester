public class class_BitMaskPractice06 {
    public static void main(String[] args){

        //問題5: ビットをクリアする
        // 次の数値に対して、特定のビットをクリアするプログラムを書きなさい。

        // 数値: 0xFF（10進数で255）
        // クリアしたいビット: 0ビット目


        int number = 0xFF;

        int mask = ~(0x1);
        System.out.println(Integer.toBinaryString(mask));

        int answer = number & mask;
        System.out.println(answer);
        System.out.println(Integer.toBinaryString(answer));

    }
}
