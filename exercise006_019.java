import java.util.Scanner;

public class exercise006_019 {
    public static void main(String[] args){

        // ユーザーに1から10までの数値を入力させ、
        // その数値が1から10までの範囲でない場合は再度入力を求めるプログラムをdo-while文を使用して作成してください。

        Scanner sc = new Scanner(System.in);

        int value;

        do {
            System.out.println("Enter value: ");
            value = sc.nextInt();

            if(value >= 1 && value <= 10){
                System.out.println(value);
                break;
            }

        } while(value < 1 || value > 10);

        sc.close();

    }
}
