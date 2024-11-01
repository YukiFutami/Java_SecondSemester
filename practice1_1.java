public class practice1_1 {
    public static void main(String[] args) {

        // みかんの価格を宣言　初期値
        int mikan = 0;
        // int mikan; でもOK

        // みかんの価格に130を第十
        mikan = 130;

        // みかんの個数を表現するint型の変数を宣言、初期値は６とする
        int mikanSu = 6;

        // みかんの総価格を表現するint型の変更を宣言、
        // 初期値にみかんの価格変数の値 * 個数変数の値を代入
        int totalValue = mikan * mikanSu;

        // みかんの価格変数の値を出力
        System.out.println("みかんの価格: " + mikan + "円");

        // 個数変数の値を出力
        System.out.println("みかんの個数: " + mikanSu + "個");

        // 総価格を出力
        System.out.println("みかんの総価格:" + totalValue + "円");
    }

}
