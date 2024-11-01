public class exerciseShift05 { // 再度やる！
    public static void main(String[] args){

        // GPT練習問題
        // 問題 5: 左シフトとマスク
        // 16ビットの整数 b = 0x1234 を4ビット左シフトし、マスクを使って下位8ビットを残してください。その結果を16進数で出力しなさい。

        int b = 0x1234;

        // 左シフト　４ビット
        int leftShift = b << 4;
        System.out.println(leftShift);

        // 下位８ビットを残すマスクを作成　！！！
        int mask = 0xFF;

        int number = leftShift & mask;
        System.out.printf("Result in hex: 0x%02X%n", number);
        System.out.println(Integer.toBinaryString(number));
        System.out.println(number);


    }

}
