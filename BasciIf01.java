import java.util.Scanner;

public class BasciIf01 {
    public static void main(String[] args){

        // 二つのinteger型の数字を入力して、比較、出力する

        Scanner scan = new Scanner(System.in);
        // これ不要！！　一つあればよい！！　Scanner scan1 = new Scanner(System.in);

        System.out.println("input to x");
        int x = scan.nextInt();

        System.out.println("input to y");
        int y = scan.nextInt();

        if (x > y){
            System.out.println("ｘが大きいです");
        } else if (x < y){
            System.out.println("yが大きいです");
        } else {
            System.out.println("同じです");
        }
        scan.close();

    }
}
