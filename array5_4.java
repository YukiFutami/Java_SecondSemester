import java.util.Scanner;

public class array5_4 {
    public static void main(String[] args){

        // 練習問題 5 - 4
        // 数値を繰り返して入力し、合計が 100 を超えた場合、
        // または入力が 10 回行われた場合、入力を止め入力された数値をすべて表示するプログラムを作成しなさい。
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        int count = 0;
        int inputCount = 0;

        for(int i = 0; i < array.length; i++){
            int inputVal = scan.nextInt();
            array[i] = inputVal;
            count += array[i]; // 合計を求めるカウント
            inputCount ++; // 入力した回数をカウント
            // １００超えた場合
            if(count >= 100){
                break;
            }
        }
        // データ引継ぎ防止のため０にする
        count = 0;

        // 表示
        for(int i = 0; i < inputCount; i++){
            count += array[i];
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("total: " + count);
    }
}
