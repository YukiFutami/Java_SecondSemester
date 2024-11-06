public class exercise004_009 {
    public static void main(String[] args){

        //整数の配列変数を宣言し、要素数が5の配列を作成してください。
        // 次に、この配列に1から5までの整数を代入して、それらの整数を順番に表示してください。

        int[] array = new int[5];

        int count = 1;
        for (int i = 0; i < 5; i++){
            array[i] = count;
            count++;
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
