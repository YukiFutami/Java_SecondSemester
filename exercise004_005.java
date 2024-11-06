import java.util.Arrays;
import java.util.Scanner;

public class exercise004_005 {
    public static void main(String[] args){

        // 文字列の配列変数を宣言し、Javaの予約語（キーワード）のいくつかを初期化してください。
        Scanner sc = new Scanner(System.in);

        String[] mesod = new String[5];
        String keyWord;

        for (int i = 0; i <mesod.length; i++){
            System.out.println("Enter keyword: ");
            keyWord = sc.nextLine();
            mesod[i] = keyWord;
        }
        System.out.println("List is : " + mesod.length);
        System.out.println("Elements is : " + Arrays.toString(mesod));

        sc.close();

    }
}
