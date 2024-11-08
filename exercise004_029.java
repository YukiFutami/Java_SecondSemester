import java.util.Arrays;

public class exercise004_029 {
    public static void main(String[] args){

        // 整数型の配列 source を宣言し、要素数を7で初期化してください。
        // その後、この配列に1から7までの整数を代入し、別の整数型の配列 destination にコピーしてください。
        // ただし、destination の要素を2倍してコピーしてください。

        int[] source = new int[7];
        source[0] = 1; source[1] = 2; source[2] = 3; source[3] = 4; source[4] = 5; source[5] = 6; source[6] = 7;
        int[] destinetion = Arrays.copyOf(source, source.length);

        for(int i = 0; i < source.length; i++){
            destinetion[i] = destinetion[i] * 2;
            System.out.print(destinetion[i] +"\t");
        }
    }
}
