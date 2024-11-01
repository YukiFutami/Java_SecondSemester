import java.util.Scanner;

public class BasicIf02 {
    public static void main(String[] args){
        // キーボードから好きな年を入力、その年は閏年かそうでないかを確認するプログラム
        // Hint
        // 閏年は以下の条件である
        // 年が４で割り切れるかつ100で割り切れない年、年が400で割り切れる年

        // 入力
        Scanner scan = new Scanner(System.in);
        System.out.print("何年を検証しますか？: ");
        int year = scan.nextInt();

//        // 照らし合わせる
//        int basicYear = 400;
//        if (year / basicYear == 0 ){
//            System.out.println("閏年です");
//        } else{
//            System.out.println("閏年ではありません");
//        }
        // 上のではうまく実行されない！！！　割り切れる数を確認しなくてはいけない！
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + "は閏年です");
        } else {
            System.out.println(year + "閏年ではありません");
        }
    }
}
