public class hatenaBlog1_6 {
    public static void main(String[] args){

        // 問題1-6
        //double型の2つの変数（身長height と 体重weight）が宣言してあります。
        //次の手順にしたがって、肥満度（BMI）測定を行ってください。
        //double型の変数bmiを宣言します。
        //変数bmiにBMI値を格納します。BMI値の算出方法は以下の通りです。
        //BMI = （体重kg） ÷ （身長m の二乗）
        //変数bmiの値を次の形式で出力します。
        //「あなたのBMI値は○○です」
        //最後に、変数bmiの値に応じて次のようなメッセージを出力します。
        //26.5以上　・・・　「肥満です」
        //25.5未満24以上　・・・　「太り気味です」
        //24未満20以上　・・・　「普通です」
        //20未満0以上　・・・　「スリムです」
        //それ以外　・・・　「エラーです」

        double height = 1.9; // m単位 cmの入力なら/100する
        double weight = 80;

        double BMI = weight / (height * height); // height / 100 をそれぞれ掛けてもよい
        System.out.printf("あなたのBMI値は %.2f%n", BMI, "です");

        // 表示内容を変数にして出力
        String message; // = ""は不要みたい

        if (BMI >= 26.5){
            message = "肥満です";
        } else if (BMI >= 24) {
            message = "太り気味です";
        } else if (BMI >= 20) {
            message = "普通です";
        } else if (BMI >= 0) {
            message = "スリムです";
        } else {
            message = "エラーです";
        }
        System.out.println(message);
    }
}
