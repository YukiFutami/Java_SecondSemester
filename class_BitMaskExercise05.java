public class class_BitMaskExercise05 {
    public static void main(String[] args){

        // 問題 5: 左シフトとマスク
        //16ビットの整数 b = 0x1234 を4ビット左シフトし、マスクを使って下位8ビットを残してください。その結果を16進数で出力しなさい。

        int b = 0x1234;
        System.out.println(Integer.toBinaryString(b));

        //shift
        int leftShit = b << 4;
        System.out.println(Integer.toBinaryString(leftShit));

        // mask 下位８ビットを残す＝８ビット以外は０にする
        int mask = 0xFF; // 1111 1111
        System.out.println(Integer.toBinaryString(mask));

        // 合わせる
        int answer = leftShit & mask;
        System.out.println(Integer.toBinaryString(answer));


    }
}
