import java.util.Scanner;

public class exercise005_017_1 {
    public static void main(String[] args) {

        // 条件分岐（if文のネスト） 017 問題
        // ユーザーに年齢と性別を尋ね、以下の条件に基づいてメッセージを表示するプログラムを作成してください。
        //年齢が20歳未満の場合、「未成年です」と表示。
        //年齢が20歳以上で性別が「女性」の場合、「成人女性です」と表示。
        //年齢が20歳以上で性別が「男性」の場合、「成人男性です」と表示。

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your age: ");
//        int userAge = scan.nextInt();
//
//        System.out.println("Enter your gender");
//        String userGender = scan.next();

//        if (userAge < 20){
//            System.out.println("未成年です");
//        } else {
//            if (userAge >= 20) {
//                if (userGender.equals("women")){
//                    System.out.println("成人女性です");
//                } else if (userGender.equals("man")){
//                    System.out.println("成人男性です");
//                }
//            }
//        }
//        scan.close();

        // 別のif文 例えば返礼の入力時点で未成年の場合、性別を入力しない
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int userAge = scan.nextInt();

        // もし１９歳以下ならば出力
        if (userAge < 20) {
            System.out.println("未成年です");
        } else {
            // 性別を入力
            System.out.println("Enter your gender");
            String userGender = scan.next();

            // 性別比較のif文
            if (userGender.equalsIgnoreCase("women")){ //equalsIgnoreCaseを使うと大文字小文字を無視して比較する
                System.out.println("成人女性です");
            } else if (userGender.equals("man")) {
                System.out.println("成人男性です");
            } else {
                System.out.println("不明な情報です");
            }
        }
        scan.close();
    }
}
