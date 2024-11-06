import java.util.Scanner;

public class exercise005_022 {
    public static void main(String[] args){

        // 条件分岐（switch文） 022 問題
        // ユーザーからアルファベットの小文字を入力として受け取り、
        // それが母音（a, e, i, o, u）か子音であるかを表示するプログラムを作成してください。

        Scanner scan = new Scanner(System.in);

        System.out.println("アルファベットを入力");
        char inputAlphabet = scan.next().charAt(0); // charAt() Stringにすると文全体を読み取ってしまうため、charが好ましい

        switch (inputAlphabet){
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("母音です");
                break;
            default:
                System.out.println("母音ではありません");
        }
        scan.close();
    }
}
