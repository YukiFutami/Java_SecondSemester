import java.util.Scanner;

public class exercise005_023 {
    public static void main(String[] args){

        // 条件分岐（switch文） 023 問題
        // ユーザーから成績（A, B, C, D, F）を入力として受け取り、
        // それに対応する評価（「優秀」「良好」「可」「不可」「不明」など）を表示するプログラムを作成してください。

        Scanner scan = new Scanner(System.in);

        System.out.println("Alphabetを入力");
        char alphabet = scan.next().charAt(0);

        switch (alphabet){
            case 'A':
                System.out.println("優秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("可");
                break;
            case 'D':
                System.out.println("不可");
                break;
            case 'F':
                System.out.println("不明");
            default:
                System.out.println("入力値が間違っています");
        }
        scan.close();
    }
}
