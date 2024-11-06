import java.util.Arrays;

public class exercise004_016 {
    public static void main(String[] args){

        // 整数の配列が与えられた場合、奇数と偶数の要素を別々の配列に分離するプログラムを書いてください。


        // 配列
        int[] originalArray = {1,2,3,4,5,6,7,8,9,10};

        // 奇数要素用と偶数要素用の配列を初期化
        int[] oddArray = new int[originalArray.length];
        int[] evenArray = new int[originalArray.length];

        int oddCount = 0;
        int eventCount = 0;

        for(int i = 0; i < originalArray.length; i++){
            // 奇数の場合
            if(originalArray[i] % 2 != 0){
                oddArray[oddCount] = originalArray[i];
                oddCount++;
            } else {
                // 偶数の場合
                evenArray[eventCount] = originalArray[i];
                eventCount++;
            }
        }
        System.out.println(Arrays.toString(oddArray));
    }
}
