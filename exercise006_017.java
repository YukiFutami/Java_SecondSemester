import java.util.Scanner;

public class exercise006_017 {
    public static void main(String[] args){

        // ユーザーに整数を入力させ、入力された整数が0でない限り、
        // 入力された整数を表示し続けるプログラムをdo-while文を使用して作成してください。

        Scanner sc = new Scanner(System.in);


        int num;

        do{
            System.out.println("Enter value: ");
            num = sc.nextInt();

            if(num != 0) {
                System.out.println("value: " + num);
            }

        } while (num != 0);
        System.out.println("0が入力されました");

        sc.close();
    }
}
