import java.util.Scanner;

public class exercise005_004 {
    public static void main(String[] args){

        // 条件分岐（if文） 004 問題
        // ユーザーから2つの整数を受け取り、それらの整数が等しい場合に「等しい」と表示し、異なる場合には何も表示しないプログラムを書いてください。

        Scanner scan = new Scanner(System.in);
        System.out.print("1つ目: ");
        int num1 = scan.nextInt();

        System.out.print("2つ目: ");
        int num2 = scan.nextInt();

        if (num1 == num2) System.out.println("２つの整数は等しいです");

        scan.close();

    }
}
