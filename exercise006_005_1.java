public class exercise006_005_1 {
    public static void main(String[] args) {

        // 006 繰り返し（for文） 005 問題
        // 1から10までの整数を表示し、偶数の場合はその数を3倍にして表示するプログラムをfor文のブロック内で更新式を使って作成してください。

        for (int value = 1; value <= 10; value++){
            System.out.println("Number: " + value);

            if (value % 2 == 0){
                value *= 3;
                System.out.println("Number3bai: " + value);
            } else {
                System.out.println();
            }
        }

    }
}
