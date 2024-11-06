import java.util.Scanner;

public class exercise005_017 {
    public static void main(String[] args){

        //条件分岐（if文のネスト） 017 問題
        // ユーザーに年齢と性別を尋ね、以下の条件に基づいてメッセージを表示するプログラムを作成してください。
        //年齢が20歳未満の場合、「未成年です」と表示。
        //年齢が20歳以上で性別が「女性」の場合、「成人女性です」と表示。
        //年齢が20歳以上で性別が「男性」の場合、「成人男性です」と表示。

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        System.out.print("Enter your gender: ");
        String gender = scan.next();

        if (age < 20){
            System.out.println("未成年です");
        } else {
            if (gender.equals("women")){
                System.out.println("成人女性です");
            } else if (gender.equals("man")){
                System.out.println("成人男性です");
            } else {
                System.out.println("Type it again");
            }
        }

        scan.close();
    }
}
