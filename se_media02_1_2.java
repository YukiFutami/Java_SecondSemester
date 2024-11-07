import java.util.Scanner;

public class se_media02_1_2 {
    public static void main(String[] args){

        // 以下のように実行される、1~12 の範囲で月を入力すると日本での季節を表示するプログラムを、
        // 「if~else if」文を用いて作成してください。
        // (3,4,5月は春、6,7,8月は夏、9,10,11月は秋、12,1,2月は冬を表示)
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter month: ");
        int month = scan.nextInt();

        String season = "";
        if (month == 3 || month == 4 || month == 5){ // (month >= 3 && month <= 5)
            season = "Spring";
        } else if (month == 6 || month == 7 || month == 8) { // (month >= 6 && month <= 8)
            season = "Summer";
        } else if (month == 9 || month == 10 || month == 11) { // (month >= 9 && month <= 11)
            season = "Fall";
        } else {
            season = "Winter";
        }

        System.out.println(month + "is" + season);

    }
}
