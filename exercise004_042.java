public class exercise004_042 {
    public static void main(String[] args){

        // 2次元整数配列が与えられた場合、配列内の最小値と最大値を見つけてください。

        int[][] num = {{0,1,2}, {3,4,5}, {6,7,8}};
        // 最大値
        int max = num[0][0];

        // 最小値
        int min = num[0][0];

        // １次元の確認
        for(int i = 0; i < num.length; i++){

            // ２次元の確認
            for(int j = 0; j < num[i].length; j++){

                if (max <= num[i][j]){
                    max = num[i][j];
                }
                if (min >= num[i][j]){
                    min = num[i][j];
                }
            }
        }

        System.out.println(max + ";" + min);
    }
}
