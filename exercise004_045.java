import java.util.Arrays;

public class exercise004_045 {
    public static void main(String[] args){

        // 4×4の2次元整数配列 grid が与えられた場合、この配列の要素数を使用して、
        // すべての要素に順番に値を代入するプログラムを作成してください。

        int[][] grid = new int[4][4];
        int element = grid.length * grid[0].length;

        int value = 1;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                grid[i][j] = value;
                value++;
            }
        }

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                System.out.printf("%3d " , grid[i][j]);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(grid));



    }
}
