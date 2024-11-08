import java.util.Arrays;

public class exercise004_028 {
    public static void main(String[] args){

        // 整数型の配列 originalArray を宣言し、要素数が10で初期化してください。
        // その後、この配列にランダムな整数値を代入し、新しい整数型の配列 copiedArray にコピーしてください。

        int[] originalArray = new int[10];

//        int[] copiedArray = new int[originalArray.length];

        for(int i = 0; i < originalArray.length; i++){
            int num = (int)(Math.random() * 10);
            originalArray[i] = num;
//            copiedArray[i] = originalArray[i];
        }
        int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);

        System.out.println(Arrays.toString(originalArray));
        System.out.println(Arrays.toString(copiedArray));

    }
}
