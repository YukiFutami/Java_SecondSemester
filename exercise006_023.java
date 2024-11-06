public class exercise006_023 {
    public static void main(String[] args){

        // 1から50までの整数で、3の倍数かつ5の倍数でない数だけを表示するプログラムを作成してください。
        // ただし、10個表示したらループを終了させてください。

        int count = 0;

        for(int i = 1; i <= 50; i++){

            if(i % 3 != 0 && i % 5 != 0){
                System.out.println(i);
                count++;
            }

            if(count == 10){
                break;
            }

        }

    }
}
