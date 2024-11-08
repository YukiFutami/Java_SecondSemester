import java.util.Arrays;

public class exercise004_027 {
    public static void main(String[] args){

        // 文字列型の配列 names を宣言し、要素数が3で初期化してください。
        // その後、この配列に好きな3つの名前を代入し、新しい文字列型の配列 copyNames にコピーしてください。

        String[] names = {"tanaka", "yamamoto", "okada"};
        String[] newNames = new String[names.length];
        for(int i = 0; i < names.length; i++){
             newNames[i]= names[i];
        }
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(newNames));

    }
}
