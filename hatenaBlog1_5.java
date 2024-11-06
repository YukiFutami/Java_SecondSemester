public class hatenaBlog1_5 {
    public static void main(String[] args){

        // 問題1-5
        //int型の変数ageが宣言してあります。変数ageは年齢を表しています。
        //変数ageの値が20以上の場合は「成人です」と表示します。
        //また、変数ageの値が20未満かつ0以上の場合は「未成年です」と表示します。
        //それ以外の場合は「エラー」と表示します。
        //さらに、未成年の場合に限り次のような表示も行います。
        // 変数ageの値が6未満または14より大きい場合は「今は義務教育を受けていません」と表示し、
        // それ以外の場合は「今は義務教育を受けています」と表示します。

        int age = 25;

        if (age >= 20){
            System.out.println("成人です");
        } else if (age >= 0){
            System.out.println("未成年です");

            if (age > 14 || age < 6){ // &&を使ったほうが良い　１４歳以上かつ６歳未満なら ||は"または"の意味
                System.out.println("今は義務教育を受けていません");
            } else {
                System.out.println("今は義務教育を受けています");
            }

        } else {
            System.out.println("エラー");
        }


    }
}
