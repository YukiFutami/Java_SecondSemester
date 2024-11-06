import java.util.Arrays;

public class exercise004_026 {
    public static void main(String[] args){

        // 整数型の配列 sourceArray を宣言し、要素数が5で初期化してください。
        // その後、この配列に1から5までの整数を代入し、別の整数型の配列 targetArray にコピーしてください。

        int[] sourceArray = new int[]{1,2,3,4,5};

        int[] targetArray = new int[sourceArray.length];
        for(int i = 0; i < sourceArray.length; i++){
            targetArray[i] = sourceArray[i];
        }
        System.out.println("SourceArray" + Arrays.toString(sourceArray));
        System.out.println("targetArray" + Arrays.toString(targetArray));

        System.out.print("targetArray: ");
        for (int value : targetArray) { // 上と同じ
            System.out.print(value + " ");
        }

    }
}
