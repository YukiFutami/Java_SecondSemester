public class exercise006_005 {
    public static void main(String[] args) {

        // 006 繰り返し（for文） 005 問題
        // 1から10までの整数を表示し、偶数の場合はその数を3倍にして表示するプログラムをfor文のブロック内で更新式を使って作成してください。

//        for (int i = 1; i <= 10; i++){ // 問題文理解不足、下記に再度作成
//            if (i % 2 == 0){
//                int result = 3 * i;
//                System.out.println(result);
//            }
//        }

        for (int i = 1; i <= 10; i++) {
            // 1から10までの整数を表示
            // System.out.println("Number: " + i);

            // 偶数の場合はその数を3倍にして表示する
            if (i % 2 == 0) {
                int gu = 3 * i;
                System.out.println("Number: " + i + " 3の倍数=" + gu);
            } else {
                System.out.println("Number: " + i);
            }
            // 更新式を含めるときれいじゃないので必ず出力するように変更

        }
    }
}