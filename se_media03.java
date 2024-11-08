public class se_media03 {
    public static void main(String[] args) {

        // 問題 3 難易度 ★
        //問 1
        //① 整数型の変数 age を宣言し、自分の年齢を代入してください。
        //② 文字(char)型の変数 unit を宣言して、「才」を代入してください。
        //③ 文字列(String)型の変数 name を宣言して、自分の氏名を代入してください。
        //④ 上記の変数を使用して「**才の****さん、こんにちは。」と出力してください。

        // 1
        int age = 30;
        // 2
        char unit = '才';
        // 3
        String name = "Futami";
        // 4
        System.out.println(age + unit + "の" + name + "さん、こんにちは。");

        // 問 2
        //① 整数型の変数 nowYear を宣言して、現在の西暦を代入してください。
        //② 整数型の変数 nextCentury を宣言して、2101 を代入してください。
        //③ 上記の変数を使って「22 世紀まであと、**年です。」と出力してください。
        //④ 上記の変数を使って「****さんは 22 世紀には**才ですね。」と出力してください。

        // 1
        int nowYear = 2024;

        // 2
        int nextCentury = 2101;

        // 3
        int nokori = nextCentury - nowYear;
        System.out.println("22世紀まで、あと" + nokori + "年です");

        // 4
        System.out.println(name + "さんは、２２世紀には" + (nokori + age) + "才ですね");

        // 問 3
        //① 20億に10億を足した数値を表示してください
        //　 (よくある間違い)↓
        //　 System.out.println(2000000000 + 1000000000);

        System.out.println(2000000000l + 1000000000l);

        // 問 4
        //① 0.1 に 0.2 を足した数値を表示してください
        //　 (誤答ではないが注意すべき例)↓
        //　 浮動小数の計算は誤差が発生します。気を付けましょう。
        System.out.println(0.1 + 0.2);




    }
}
