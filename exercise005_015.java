import java.util.Scanner;

public class exercise005_015 {
    public static void main(String[] args){

        // 条件分岐（if〜else if〜else文） 015 問題
        // ユーザーから国の略語を入力として受け取り、その国で話されている公用語を表示するプログラムを作成してください。
        //“JP” の場合、日本語を表示。
        //“FR” の場合、フランス語を表示。
        //“DE” の場合、ドイツ語を表示。
        //それ以外の場合、「言語情報なし」を表示。

        Scanner scan = new Scanner(System.in);

        System.out.print("国の略語を入力: "); // Abbreviations 略語
        String country = scan.next();

        if (country == "JP")System.out.println("日本語");
        else if (country == "FR")System.out.println("フランス語");

        /* next() と nextLine() の違い
        next():

        スペースや改行で区切られた1つの単語を取得します。
        入力にスペースが含まれる場合、最初の単語だけが取得されます。
        改行文字は無視され、次の入力まで残ります。
        nextLine():

        1行全体の文字列（改行までの入力）を取得します。
        スペースを含む文章もそのまま取得します。
        改行文字（\n）を含んで入力終了するため、次の入力は影響を受けない。 */

    }
}
