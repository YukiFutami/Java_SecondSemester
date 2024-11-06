import java.util.Scanner;

public class exercise005_016 {
    public static void main(String[] args){

        // 条件分岐（if〜else if〜else文） 016 問題
        // ユーザーから交通信号機の色（”赤”、”青”、”緑”など）を入力として受け取り、その信号機の色に応じて行動を表示するプログラムを作成してください。
        //“赤” の場合、「停止してください」を表示。
        //“青” の場合、「進行してください」を表示。
        //“緑” の場合、「進行できますが注意してください」を表示。
        //それ以外の場合、「不明な指示です」を表示。

        Scanner scan = new Scanner(System.in);
        System.out.println("What are the colours of the traffic lights? :");
        String colour = scan.next();

        if (colour.equals("red")){
            System.out.println("停止してください");
        } else if (colour.equals("blue")) {
            System.out.println("進行してください");
        } else if (colour.equals("green")) {
            System.out.println("進行できますが注意してください");
        } else {
            System.out.println("不明な指示です");
        }
        scan.close();
    }
}
