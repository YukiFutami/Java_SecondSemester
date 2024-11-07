import java.util.Scanner;

public class se_media02_1_5 {
    public static void main(String[] args) {

        // 西暦を入力すると「うるう年」か「平年」かを判定するプログラムを作成してください。
        //西暦年が 4 で割り切れる年は(原則として)「うるう年」。
        //ただし、西暦年が 100 で割り切れる年は(原則として)「平年」。
        //ただし、西暦年が 400 で割り切れる年は必ず「うるう年」。

        Scanner scan = new Scanner(System.in);
        System.out.println("西暦を整数で入力してください");
        int year = scan.nextInt();

        if(year % 4 == 0){
            System.out.println("うるう年");
        } else if (year % 100 == 0){
            System.out.println("平年");
        } else if (year % 400 == 0){
            System.out.println("うるう年");
        } else {
            System.out.println("平年");
        }
        scan.close();
    }
}
