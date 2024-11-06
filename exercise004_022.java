import java.util.Arrays;

public class exercise004_022 {
    public static void main(String[] args){

        // 整数型の配列を宣言し、要素数が7の配列を作成し、
        // 配列の初期化として1, 2, 3, 4, 5, 6, 7を代入してください。その後、配列の要素を2倍して表示してください。

        int[] array = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < array.length; i++){

            array[i] = array[i] * 2;
        }
        System.out.println(Arrays.toString(array));


    }
}
