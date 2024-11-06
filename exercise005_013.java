import java.util.Scanner;

public class exercise005_013 {
    public static void main(String[] args){

        // 条件分岐（if〜else if〜else文） 013 問題
        // ユーザーから月を入力として受け取り、入力された月に応じて季節を表示するプログラムを作成してください。
        //3月から5月の場合、「春」を表示。
        //6月から8月の場合、「夏」を表示。
        //9月から11月の場合、「秋」を表示。
        //12月から2月の場合、「冬」を表示。

        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter month: ");
        int month = scan.nextInt();

        if (month == 3 || month == 4 || month == 5){ // month >= 3 && month <= 5
            System.out.printf("春");
        } else if (month == 6 || month == 7 || month == 8){ // month >= 6 && month <= 8
            System.out.printf("夏");
        } else if (month == 9 || month == 10 || month == 11){ // month >= 9 && month <= 11
            System.out.printf("秋");
        } else { //
            System.out.printf("冬");
        }

        scan.close();
    }
}
