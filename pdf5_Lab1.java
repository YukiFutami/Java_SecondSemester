import java.util.Scanner;

public class pdf5_Lab1 {

    static void menuScreen(){
        System.out.println("menu");
        System.out.println("1: 学生成績入力");
        System.out.println("2: 入力された学生の目録を出力");
        System.out.println("3: 学生削除");
        System.out.println("4: 終了");
    }

    // メニュー選択




    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        menuScreen();
        System.out.print("選択: ");
        int userInput = scan.nextInt();







    }
}
