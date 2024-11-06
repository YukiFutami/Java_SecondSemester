public class exercise006_004 {
    public static void main(String[] args){

        // 006 繰り返し（for文） 004 問題
        // 2の倍数を10回繰り返し表示するプログラムを作成してください。
        int result = 0;

        for (int i = 0; i <= 10 ; i++){ // ここではループ回数の宣言をする
            result = 2 * i; //２の倍数を求めるので２＊iとする
            System.out.println(result);
        }

    }
}
