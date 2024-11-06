import java.util.Scanner;

public class SchoolBig_Switch03 {
    public static void main(String[] args){

        // 3. 二つの数字の演算
        // int型の数字を2つ入力して、「+ - * /」演算子の中から入力して、その演算子に応じて計算し、コンソールに出力する

        int num1, num2;
        char kp;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number1: ");
        num1 = scan.nextInt();

        System.out.println("Enter number2: ");
        num2 = scan.nextInt();

        System.out.println("Choise into (+ - * /) :");
        kp = scan.next().charAt(0); // 文字列の指定した位置（インデックス）にある1文字を取得する

        switch (kp){
            case '+':
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                break;
            case '/':
                //　例外処理　　割り算の時、割る数が０になってはいけない
                if (num2 == 0){
                    System.out.println("２つ目の数字が０になってはいけません");
                } else {
                    System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                }
                break;
            default:
                System.out.println("演算子不正!");
        }
        scan.close();
    }
}
