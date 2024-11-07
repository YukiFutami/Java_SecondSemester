import java.util.Scanner;

public class se_media02_1_3 {
    public static void main(String[] args){

        //以下のように実行される、1~12 の範囲で月を入力すると日本での季節を表示するプログラムを、「
        // switch」文を用いて作成してください。
        //(3,4,5月は春、6,7,8月は夏、9,10,11月は秋、12,1,2月は冬を表示)

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month: ");
        int month = scan.nextInt();

        String season = "";
        switch (month){
            case 12: case 1: case 2:{
                season = "Winter";
                break;
            }
            case 3: case 4: case 5:{
                season = "Spring";
                break;
            }
            case 6: case 7: case 8:{
                season = "Summer";
                break;
            }
            case 9: case 10: case 11:{
                season = "Fall";
                break;
            }
            default:
                return;
        }
        System.out.println(season);


    }
}
