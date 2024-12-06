import java.util.Arrays;
import java.util.Scanner;

public class for_del_01 {
    public static void main(String[] args){

        // 問題 1: 単純な削除
        // 配列内にある整数値から、特定の値を削除するプログラムを作成してください。配列のサイズは固定とし、削除後は詰めること。
        // 条件
        // 配列は {10, 20, 30, 40, 50} とする。
        // 削除したい値をユーザーから入力する。
        // 該当する値があれば削除し、詰める。
        // 削除後の配列を表示する。

        Scanner scan = new Scanner(System.in);
        int[] array = {10, 20, 30, 40, 50};
        while (true){
            System.out.print("Enter number: ");
            int enterNum = scan.nextInt();

            for(int i = 0; i < array.length; i++){
                if(enterNum == array[i]){
                    array[i + 1] = array[i];
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
