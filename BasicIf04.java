import java.text.DecimalFormat;
import java.util.Scanner;

public class BasicIf04 {
    public static void main(String[] args){

        // a, bの入力
        // xを求める Formula: ax + b = 0
        // １次方程式を解くプログラム
        // a = 0 かつ　b=0の場合: 解が無数にある
        // a=0 かつb!=0の場合: 解がない
        // それ以外の場合: x= -b/a
        //  次やるとき、DecimalFormatクラスを使用したい

        int a, b;
        Double kai;

        Scanner scan = new Scanner(System.in);
        System.out.println("a value:");
        a = scan.nextInt();

        System.out.println("b value: ");
        b = scan.nextInt();

        System.out.println("１次方程式" + a + "x + " + b +"= 0");

        if (a == 0){
            if (b == 0){
                System.out.println("解は無数にある");
            } else {
                System.out.println("解がない");
            }
        } else {
            kai = (double) -b / a;
            System.out.println(kai);
        }
    }
}
