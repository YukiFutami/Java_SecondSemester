import java.util.Random;

public class exercise004_021 {
    public static void main(String[] args){

        // double型の配列を宣言し、要素数が10の配列を作成して、0から9までのランダムな浮動小数点数を代入してください。
        double[] randomNum = new double[10];

        Random random = new Random();

        for(int i = 0; i < randomNum.length; i++){
            double randomValue = random.nextDouble() * 10.0;

            randomNum[i] = (int)randomValue;
        }

        for(int i = 0; i < randomNum.length; i++){
            System.out.println("Index: " + i + ":" + randomNum[i]);
        }
    }
}
