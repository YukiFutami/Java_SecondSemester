import java.util.Arrays;

public class exercise004_030 {
    public static void main(String[] args){

        // 文字列型の配列 colors を宣言し、要素数が4で初期化してください。
        // その後、この配列に4つの異なる色の名前を代入し、新しい文字列型の配列 colorCopy にコピーしてください。

        String[] colors = new String[4];
        colors [0] = "pink"; colors[1] = "red"; colors[2] = "blue"; colors[3] = "black";

        String[] newColors = Arrays.copyOf(colors, colors.length);
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(newColors));
    }
}
