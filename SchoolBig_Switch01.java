import java.util.Scanner;

public class SchoolBig_Switch01 {
    public static void main(String[] args){

        // 1.  switchで何曜日か確認する
        // キーボードから1から7までの数字を入力して、それに応じて、何曜日かコンソールに出力する
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number: ");
        num = scan.nextInt();

        switch (num){
            case 1:
                System.out.println(num + "は月曜日です");
                break;
            case 2:
                System.out.println(num + "は火曜日です");
                break;
            case 3:
                System.out.println(num + "は水曜日です");
                break;
            case 4:
                System.out.println(num + "は木曜日です");
                break;
            case 5:
                System.out.println(num + "は金曜日です");
                break;
            case 6:
                System.out.println(num + "は土曜日です");
                break;
            case 7 :
                System.out.println(num + "は日曜日です");
                break;
            default:
                System.out.println("希望の数字を入力してください");
        }
        scan.close();
    }
}
