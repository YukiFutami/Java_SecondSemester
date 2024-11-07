import java.util.Scanner;

public class se_media03_1_1 {
    public static void main(String[] args){

        // 採点結果に 80 以上の数値が入力されるまで、繰り返し入力を受け続けるプログラムを作成してください。

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Enter your score: ");
            int score = scan.nextInt();

            if (score >= 80){
                System.out.println(score);
                break;
            }
        }



    }
}
