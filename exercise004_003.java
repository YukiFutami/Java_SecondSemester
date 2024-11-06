public class exercise004_003 {
    public static void main(String[] args){

        // double型の配列変数を宣言し、10のランダムな浮動小数点数を初期化してください。

        double[] randomNumber;

        randomNumber = new double[10];

        for (int i = 0; i < randomNumber.length; i++){
            randomNumber[i] = Math.random();
            System.out.println(randomNumber[i]);
        }

        for(int i = 0; i < randomNumber.length; i++){
            System.out.println("random Number " + i + ": " + randomNumber[i]);
        }

    }
}
