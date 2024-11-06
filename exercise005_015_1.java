import java.util.Scanner;

public class exercise005_015_1 {
    public static void main(String[] args){

        // ２回目　条件分岐（if〜else if〜else文） 015 問題
        // ユーザーから国の略語を入力として受け取り、その国で話されている公用語を表示するプログラムを作成してください。
        //“JP” の場合、日本語を表示。
        //“FR” の場合、フランス語を表示。
        //“DE” の場合、ドイツ語を表示。
        //それ以外の場合、「言語情報なし」を表示。

        Scanner scan = new Scanner(System.in);

        System.out.println("国の略語を入力: ");
        String country = scan.next();

//        if (country.equals("JP"))System.out.println("日本語");
//        else if (country.equals("FR"))System.out.println("フランス語");
//        else if (country.equals("DE"))System.out.println("ドイツ語");
//        else System.out.println("言語情報なし");
//
//        scan.close();

        // 公用語を格納するやり方
        String language = ""; // 公用語を格納

        if (country.equals("JP")){
            language = "日本語";
        } else if (country.equals("FP")){
            language = "フランス語";
        } else if (country.equals("DE")) {
            language = "ドイツ語";
        } else {
            language = "言語情報なし";
        }

        //　結果を表示
        System.out.println("国の公用語は" + language + "です。");

        scan.close();

    }
}
