public class exercise006_018 {
    public static void main(String[] args){

        // 1から20までの奇数を表示するプログラムをdo-while文を使用して作成してください。

        int value = 1;

        do {
            if(value % 2 != 0){
                System.out.println(value);
            }
            value++;

        } while(value <= 20);
        System.out.println("20まで数え終わり");
    }
}
