public class exercise004_001 {
    public static void main(String[] args){

        // 整数の配列変数を宣言して、要素数が5の配列を初期化し、すべての要素をゼロに設定してください。

        int[] myArray;

        int element = 5;

        myArray = new int[element];

        for (int i = 0; i < myArray.length; i++){
            System.out.println("myArray [" + i + "] =" + myArray[i]);
        }


    }
}
