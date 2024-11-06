public class exercise006_022 {
    public static void main(String[] args){

        // 1から10までの奇数だけを表示するプログラムを作成してください。
        // ただし、5の倍数の場合は表示せずに次の数に進んでください。

        for(int i = 1; i <= 10; i++){

            if(i % 5 == 0){
                continue;
            }

            if(i % 2 != 0){
                System.out.println(i);
            }

        }

    }
}
