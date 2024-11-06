public class exercise004_008 {
    public static void main(String[] args){

        // 整数の配列変数を宣言し、フィボナッチ数列の最初の10個の要素を初期化してください。
        // 0 1 1 2 3 5 8 13 21 34 55


        int[] fibonacci;
        fibonacci = new int[10];

        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i = 2; i < 10; i++){
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < 10; i++){
            System.out.println(fibonacci[i]);
        }


    }
}
