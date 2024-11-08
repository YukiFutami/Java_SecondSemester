import java.util.Scanner;

public class exercise004_033 {
    public static void main(String[] args){

        // ユーザーから入力された整数を要素数として持つ整数型の配列を宣言し、初期化してください。
        // その後、配列の要素数を出力するプログラムを作成してください。

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter elemental value: ");
        int elemental = scan.nextInt();

        int[] value = new int[elemental];
        System.out.println(value.length);

        scan.close();



    }
}
