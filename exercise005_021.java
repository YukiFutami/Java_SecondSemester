import java.util.Scanner;

public class exercise005_021 {
    public static void main(String[] args){

        // 条件分岐（switch文） 021 問題
        // ユーザーから1から12までの整数（月）を入力として受け取り、それに対応する月の日数を表示するプログラムを作成してください。
        // 例えば、2を入力したら「28または29日」、4を入力したら「30日」などが表示されるようにします。

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter month: ");
        int month = scan.nextInt();

        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.print("31日");
                break;
            case 2:
                System.out.print("28日または２９日まで");
                break;
            case 4: case 6: case 9: case 11:
                System.out.print("３０日まで");
                break;
            default:
                System.out.print("1月から１２月の間で入力してください");
        }
        scan.close();
    }
}
