import java.util.Arrays;

public class exercise004_040 {
    public static void main(String[] args){

        // 2次元整数配列が与えられた場合、特定の要素の値を変更してください。
        // 例えば、matrix[0][1] の値を新しい値に変更してください。

        int[][] matrix = {
                {1,2,3}, {4,5,6}, {7,8,9}
        };

        matrix[2][1] = 100;

        System.out.println(matrix[2][1]);
        System.out.println(Arrays.deepToString(matrix));

    }
}
