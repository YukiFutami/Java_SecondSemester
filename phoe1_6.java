public class phoe1_6 {
    public static void main(String[] args){

        // double型の2つの変数（身長height と 体重weight）が宣言してあります。
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

        double height = 170.0;
        double weight = 55.0;

        double bmi;
        bmi = weight / ((height / 100) * (height / 100));
        System.out.println("あなたのBMI値は " + bmi + "です");
        if(bmi >= 26.5){
            System.out.println("肥満です");
        } else if (bmi >= 24) {
            System.out.println("太り気味です");
        } else if (bmi >= 20) {
            System.out.println("普通です");
        } else if (bmi >= 0) {
            System.out.println("スリムです");
        } else {
            System.out.println("エラーです");
        }

    }
}
