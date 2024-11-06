import java.util.Arrays;
import java.util.Scanner;

public class exercise004_004 {
    public static void main(String[] args){

        // 整数の配列変数を宣言し、ユーザーからキーボード入力を受け取り、入力された整数の数だけ要素を持つ配列を初期化してください。

        Scanner scan =new Scanner(System.in);

        // 宣言
        int[] arrayBar;

        // 配列の要素の数を入力
        System.out.println("Enter value: ");
        int value = scan.nextInt();
        arrayBar = new int[value];

        // その数分の整数を入力
        for (int i = 0; i < arrayBar.length; i++){
            System.out.println("Enter value in element : ");
            int element = scan.nextInt();
            arrayBar[i] = element;
        }

        System.out.println("elemnt is : " + Arrays.toString(arrayBar));
        scan.close();

        // 出力


    }
}
