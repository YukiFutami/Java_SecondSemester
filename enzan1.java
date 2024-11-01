import java.util.Scanner;

public class enzan1 {
    public static void main(String args[]){

        // Scnnerクラスのインスタンスを作成する
        Scanner scan = new Scanner(System.in);

        // nextInt()メゾットを使用する
        System.out.println("あなたの名前を入力: ");
        String yourName = scan.nextLine(); // 情報の取得　文字はnextLine
        System.out.println("nextLine()であなたの名前は: " + yourName);
        System.out.println("\n");

        // nextInt()メゾットを使用する
        System.out.println("あなたの年齢を入力: ");
        int yourAge = scan.nextInt(); // 情報の取得 整数はnextInt
        System.out.println("あなたの年齢は: " + yourAge);
        System.out.println("\n");

        //next()メゾットを使用する
        System.out.println("あなたの住所を入力: ");
        String yourAddress = scan.next(); //　情報の取得
        System.out.println("next()であなたの住所は: " + yourAddress);
        System.out.println("\n");
    }
}
