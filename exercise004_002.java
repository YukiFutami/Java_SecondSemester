import java.util.Arrays;
import java.util.Scanner;

public class exercise004_002 {
    public static void main(String[] args){

        // 文字列の配列変数を宣言し、3つの好きなフルーツの名前を初期化してください。

        Scanner scan = new Scanner(System.in);

        String[] fruits;
        int value = 3;
        fruits = new String[value];

        for (int i = 0; i < fruits.length; i++){
            System.out.println("Enter your like fruits name: ");
            String fruitsName = scan.nextLine();
            fruits[i] = fruitsName;
//            System.out.println("fruits name is : " +  fruitsName);
        }
        System.out.println("fruits name is : " + Arrays.toString(fruits)); // 要素の中身をすべて表示する
        scan.close();

    }
}
