import java.util.Scanner;

public class exercise005_024 {
    public static void main(String[] arg){

        // 条件分岐（switch文） 024 問題
        // ユーザーから1から4までの整数（季節）を入力として受け取り、]
        // それに対応する季節名を表示するプログラムを作成してください。
        // 例えば、1を入力したら「春」、2を入力したら「夏」などが表示されるようにします。

        Scanner scanner = new Scanner(System.in);

        System.out.println("１から４までの数字を入力してください");
        int inputSeason = scanner.nextInt();


         String outputSeason = "";

        switch (inputSeason){
            case 1:
                outputSeason = "春";
                break;
            case 2:
                outputSeason = "夏";
                break;
            case 3:
                outputSeason = "秋";
                break;
            case 4:
                outputSeason = "冬";
                break;
            default:
                outputSeason = ("入力外");
        }
        System.out.println("季節は" + outputSeason + "です");
        scanner.close();
    }
}
