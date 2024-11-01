public class class_BitMaskExercise07 {
    public static void main(String[] args){

        // 問題 7: シフトを使った簡単な乗算
        //d = 5 を3ビット左にシフトしてみてください。この結果はdを何倍にしたことになりますか？ その結果を10進数で出力しなさい

        int d = 5;

        // シフトするbit数
        int leftShift = 3;

        // ３ビット左にシフトする
        int moovLeft = d << leftShift;

        //何倍になったかの計算 指定した回数だけべき乗する、
        // Mathはdoubleで返すので(int)にキャスト、べき乗なので（２, x)としxの位置は何乗するか指定できる、ビットシフトと同じ役割
        int multiolier = (int) Math.pow(2, leftShift);

        // 結果の出力
        System.out.println("シフト結果: " + moovLeft);
        System.out.println("元の値" + d + "を" + multiolier + "倍しました");

    }
}