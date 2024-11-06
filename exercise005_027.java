import java.util.Scanner;

public class exercise005_027 {
    public static void main(String[] args){

        // 条件分岐（論理演算子） 027 問題
        // ユーザーに入力された文字列が「admin」でない場合に「アクセスが拒否されました」と表示するプログラムを作成してください。

        Scanner scan = new Scanner(System.in);

        System.out.println("入力してください");
        String input1 = scan.next(); // next()を連続で使うと入力のスペースを設けた文字列の次の文字列が出力できる
//        String input2 = scan.next();

//        System.out.println(input1 + "\t" + input2);

        if (input1 != null && !input1.equalsIgnoreCase("admin")){ // null はオブジェクトがないとき（変数の中身がないとき）
            System.out.println("アクセスが拒否されました");
        } else {
            System.out.println("アクセスできました");
        }
        scan.close();
    }
}
