public class exercise004_007 {
    public static void main(String[] args){


        //整数の配列変数を宣言し、1から10までの奇数を初期化してください。

        int[] oddNumbers = new int[5];
        int value = 1;

        for (int i = 0; i < 5; i++){
            oddNumbers[i] = value;
            value += 2;
        }
        for(int i = 0; i < oddNumbers.length; i++)
        System.out.println("oddNumbers[" + i + "] = " + oddNumbers[i]);

    }
}
