public class exercise004_006 {
    public static void main(String[] args){

        // 07の問題
        // 整数の配列変数を宣言し、0から100までの偶数を初期化してください。

        //　０から１００までの偶数の合計数を求め、配列の要素数に当てはめる
        int[] array;
        int count = 0;
        for (int i = 0 ; i <= 100; i++){
            if(i % 2 == 0){ // もし偶数なら１カウントする
                count++;
            }
        }
        array = new int[count];
        System.out.println(array.length);

        count = 0;
        // 偶数の初期化:
        //　偶数を配列の各要素に代入します。偶数のリストは手動で指定する必要があります。
        int evenNumbers;
        for (evenNumbers = 0; evenNumbers <= 100; evenNumbers++) {
            if (evenNumbers % 2 == 0) {
                array[count] = evenNumbers;
                System.out.println("evenNumbers[" + count + "]" + evenNumbers);
                count++;
            }
        }
    }
}
