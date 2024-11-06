import java.util.Scanner;

public class SchoolBig_For2 {
    public static void main(String[] args){

        // 問題2.  S = 1 - 2 + 3 - 4 + 5 + ... + ((-1)^(n+1)) * nを計算する
        // 条件 : for文を使うこと。
        // ヒント : 変数iを1からnまでに増やし、iは偶数の場合、Sに足し加えますが、奇数の場合はSからiを引く。

        // 変数nを宣言 記入してもらう形式にする
        Scanner scan = new Scanner(System.in);

        System.out.println("nを入力: ");
        int n = scan.nextInt();

        // iを宣言しnの数になるまで繰り返し計算する
        // ただし、iが偶数の時はSにそのまま足し算をするが、iが奇数の場合はSからiを引く
        // ここでのSは最終結果なのでresultとする　そのためresultの宣言、初期値を０にする
        int result = 0;

        for (int i = 0; i <= n; i++){
            if (i % 2 == 0 ){
                result -= i;
            } else {
                result += i;
            }
        }

        System.out.println("nを" + n + "としたとき");
        System.out.println("1 - 2 + 3 - 4 + 5 + ... =" + result);

        scan.close();

    }
}
