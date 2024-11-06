public class exercise006_0015 {
    public static void main(String[] args){

        // 006 繰り返し（while文） 015 問題
        // while文を使用して、フィボナッチ数列の最初の10項を表示するプログラムを作成してください。

        // 初期化
        int a = 0, b = 1, count = 0;

        while (count < 10){
            System.out.println(a); // 計算したフィボナッチ数列を表示
            int fib = a + b;

            a = b;
            b = fib; // ｂの値をaに代入

            count++;
        }
    }
}
