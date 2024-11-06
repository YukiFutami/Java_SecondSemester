import java.util.Scanner;

public class exercise006_020 {
    public static void main(String[] args){

        // ユーザーに2の倍数を入力させ、
        // 入力された数が2の倍数でない場合は再度入力を求めるプログラムをdo-while文を使用して作成してください。

        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter number: ");
            num = sc.nextInt();

            if (num % 2 == 0){
                System.out.println("２倍です");
                break;
            } else {
                System.out.println("Again");
            }

        } while(num % 2 != 0);

        sc.close();

    }
}
