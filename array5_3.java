import java.util.Random;

public class array5_3 {
    public static void main(String[] args){

        // 練習問題 5 - 3
        // 次のプログラムを作成しなさい。
        // 10 個の数値を入力する。
        // 入力された数値を偶数と奇数に分類して表示する。

        int[] valueList = new int[10];

        // 10個の整数を作成
        for(int i = 0; i < valueList.length; i++){
            // ランダムに値を生成する
            Random rd = new Random();
            int num = rd.nextInt(100);
            valueList[i] = num;
            System.out.print(valueList[i] + " ");
        }
        // 判定
        System.out.print("\n" + "偶数: ");
        for(int i = 0; i < valueList.length; i++){
            if(valueList[i] % 2 == 0){
                System.out.print(valueList[i] + " ");
            }
        }

        System.out.print("\n" + "奇数: ");
        for(int i = 0; i < valueList.length; i++){
            if(valueList[i] % 2 == 1){
                System.out.print(valueList[i] + " ");
            }
        }

    }
}
