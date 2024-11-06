import java.util.Arrays;

public class exercise004_020 {
    public static void main(String[] args){

        // 文字列型の配列を宣言し、要素数が3の配列を作成して、好きな3つのフルーツの名前を代入してください。

        String[] fruit = new String[3];

        fruit[0] = "banana";
        fruit[1] = "orange";
        fruit[2] = "apple";

        System.out.println(Arrays.toString(fruit));

    }
}
