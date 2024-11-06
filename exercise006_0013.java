public class exercise006_0013 {
    public static void main(String[] args){

        // 006 繰り返し（while文） 013 問題
        // while文を使用して、2の倍数を10回繰り返し表示するプログラムを作成してください。
        int num = 1;
        int count = 0;
        while (count < 10){
            int number = num * 2;
            System.out.println(number);
            count++;
            num++;
        }



    }
}
