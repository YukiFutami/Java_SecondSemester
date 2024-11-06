import java.util.Arrays;

public class exercise004_024 {
    public static void main(String[] args){

        // 文字列型の配列を宣言し、要素数が4の新しい配列を作成し、初期化してください。
        // その後、この配列内の各要素に好きな4つの都市名を代入してください。

        String[] array = new String[]{"DC", "LA", "LS", "NY"};
//        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++){
            System.out.println(i +"番目" + array[i]);
        }
    }
}
