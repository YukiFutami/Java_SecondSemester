import java.util.Scanner;

public class exercise005_025 {
    public static void main(String[] args){

        // 条件分岐（論理演算子） 025 問題
        // ユーザーに年齢と性別（男性か女性か）を尋ね、
        // 年齢が20歳以上でかつ性別が女性の場合に「成人女性です」と表示するプログラムを作成してください。

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("年齢を入力してください");
//        int userAge = scan.nextInt();
//
//        if (userAge >= 20){
//            System.out.println("性別を入力してください");
//            String gender = scan.next();
//
//            if (gender.equalsIgnoreCase("Female")){
//                System.out.println("成人女性です");
//            } else if (gender.equalsIgnoreCase("Male")){
//                System.out.println("成人男性です");
//            } else {
//                System.out.println("成人済みですが、性別の枠にとらわれていません");
//            }
//        } else if (userAge >= 0){
//            System.out.println("未成年です");
//        } else {
//            System.out.println("数字が正しく入力されていません");
//        }
//        scan.close();

        // 問題の要求　＆＆演算を使用のため別で作成
        Scanner scan = new Scanner(System.in);
        System.out.println("年齢を入力: ");
        int age = scan.nextInt();

        System.out.println("性別を入力(Male or Female");
        String gender = scan.next();

        if (age >= 20 && gender.equals("Female"))System.out.println("成人女性です");
        else if (age >= 20 && gender.equals("Male"))System.out.println("成人男性です");
        else if (age >= 0)System.out.println("未成年です");
        else System.out.println("入力を間違えています");

        scan.close();
    }
}
