import java.util.Random;

public class exercise004_014 {
    public static void main(String[] args){
        Random rand = new Random();

        // 整数の配列が与えられた場合、その中で最大値と最小値を検出するプログラムを書いてください。

        int[] array;

        int count = 10;
        array = new int[count];

        // ランダムで配列内の値を生成
        for (int i = 0; i < array.length; i++){
            int randomValue = rand.nextInt(100);
            array[i] = randomValue;
            System.out.print(i + ":" + array[i] + "\t");
        }

        // 最大値
        int numMax = Integer.MAX_VALUE;
        int numMin = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++){
            if (array[i] < numMax){
                numMax = array[i];
            }
            if (array[i] > numMin) {
                numMin = array[i];
            }
        }
        System.out.println("\n" + numMax);
        System.out.println(numMin);


    }
}
