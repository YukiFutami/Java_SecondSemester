public class exercise004_041 {
    public static void main(String[] args){

        // 2次元整数配列が与えられた場合、行ごとの合計値を計算して、それらの値を新しい配列に格納してください。

        int[][] num = {{0,1,2}, {3,4,5}, {6,7,8}};

        int[] total = new int[num.length];

        for(int i = 0; i < num.length; i++){
            int sum = 0;
            for(int j = 0; j < num[i].length; j++){
                sum += num[i][j];
            }
            total[i] = sum;
        }

        for(int i = 0; i < total.length; i++){
            System.out.println(i + ";" + total[i]);
        }


    }
}
