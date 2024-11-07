import java.util.Scanner;

public class se_media02_1_1 {
    public static void main(String[] args){

        // 問題1
        // 水族館の入園料表示プログラムを作成してください。
        // 年齢を入力すると「6 歳未満と 75 歳以上は無料」「6~12 歳は500円」「これら以外の人は1000円」と表示します。
        Scanner scan = new Scanner(System.in);

        System.out.println("年齢を入力してください。");
        int inputAge = 0;
        inputAge = scan.nextInt();

        String label = "";
        if(inputAge < 6 || inputAge >= 75){
            label = "無料";
        } else if (inputAge <= 12) {
            label = "５００円";
        } else {
            label = "1000円";
        }
        System.out.println(inputAge + "歳のお客様は" + label + "です");

        scan.close();
    }
}
