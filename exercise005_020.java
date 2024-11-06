import java.util.Scanner;

public class exercise005_020 {
    public static void main(String[] args){

        // 条件分岐（switch文） 020 問題
        // ユーザーから1から7までの整数（曜日）を入力として受け取り、
        // それに対応する曜日名を表示するプログラムを作成してください。
        // 例えば、1を入力したら「月曜日」、2を入力したら「火曜日」などが表示されるようにします。

        // 問題文の理解間違えた。。。せっかくだから違う方法をやってみる
        Scanner scan = new Scanner(System.in);

        System.out.println("Day Number: ");
        int number = scan.nextInt();

        // 曜日を代入
        String day = "";

        switch (number){
            case 1:
                day = "Monday";
                System.out.println("Today is " + day);
                break;
            case 2:
                day = "Tuesday";
                System.out.println("Today is " + day);
                break;
            case 3:
                day = "Wednesday";
                System.out.println("Today is " + day);
                break;
            case 4:
                day = "Thursday";
                System.out.println("Today is " + day);
                break;
            case 5:
                day = "Friday";
                System.out.println("Today is " + day);
                break;
            case 6:
                day = "Saturday";
                System.out.println("Today is " + day);
                break;
            case 7:
                day = "Sunday";
                System.out.println("Today is " + day);
                break;
            default:
                System.out.println("入力値が間違っています");

        }
        scan.close();
    }
}
