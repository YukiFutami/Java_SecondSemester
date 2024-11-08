public class exercise004_043 {
    public static void main(String[] args){

        // 2×3の2次元整数配列が与えられた場合、要素数はいくつですか？
        int[][] array1 = new int[2][3];
        int index = 0;
        // １次元
        for(int i = 0; i < array1.length; i++){
            // ２次元
            for(int j = 0; j < array1[i].length; j++){
                index++;
            }
        }
        System.out.println(index);
        System.out.println(array1.length * array1[0].length);

        // 2x2x4の3次元文字列配列が与えられた場合、要素数はいくつですか？
        int[][][] array2 = new int[2][2][4];
        int index2 = 0;
        for(int i = 0; i < array2.length; i++){
            // ２次元
            for(int j = 0; j < array2[i].length; j++){
                // 3次元
                for(int k = 0; k < array2[i][j].length; k++){
                    index2++;
                }
            }
        }
        System.out.println(index2);

        // 4x3x2x2の多次元配列が与えられた場合、要素数はいくつですか？
        int[][][][] array3 = new int[4][3][2][2];
        int index3 = 0;
        for(int i = 0; i < array3.length; i++){
            // ２次元
            for(int j = 0; j < array3[i].length; j++){
                // 3次元
                for(int k = 0; k < array3[i][j].length; k++){
                    // ４時次元
                    for(int m = 0; m < array3[i][j][k].length; m++){
                        index3++;
                    }
                }
            }
        }
        System.out.println(index3);
    }
}
