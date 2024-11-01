import java.util.Scanner;

public class basicIf03 {
    public static void main(String[] args){

        // 三角形の３つの辺をキーボードから入力して、周囲を計算する
        Scanner scan = new Scanner(System.in);

        System.out.println("First Line:");
        float line1 = scan.nextFloat();

        System.out.println("Second Line:");
        float line2 = scan.nextFloat();

        System.out.println("Third Line:");
        float line3 = scan.nextFloat();

        // 全て同じなら正三角形、１辺に対して２つが同じ場合も三角形、1辺の値に対して2辺の合計が超える場合三角形
        if ((line1 + line2 > line3) && (line2 + line3 > line1) && (line3 + line1 > line2)){
            int hen = (int) (line1 + line2 + line3);
            System.out.println("三角形の範囲: " + hen);
        } else {
            System.out.println("三角形の掲載はできません");
        }
    }
}
