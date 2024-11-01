public class bitMaskGpt05 {
    public static void main(String[] args){

        // 左シフト演算
        // 10進数で「7」の数値を2ビット左にシフトさせ、結果を求めてください。
        // その結果を2進数と10進数で表示してください。

        int numbre = 7;
        System.out.println(Integer.toBinaryString(numbre));

        // シフト ７を２進数にした値を２ビット動かすだけ　１を設定するわけじゃない
        // int ShitNumber = numbre & (1 << 2);
        int ShitNumber = numbre << 2;

        // 出力
        System.out.println(Integer.toBinaryString(ShitNumber));
        System.out.println(ShitNumber);

    }
}
