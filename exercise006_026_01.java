public class exercise006_026_01 {
    public static void main(String[] args){

        // 1から100までの整数を表示する四重のforループを使用したプログラムを作成してください。
        // ただし、以下の条件に合致する場合にcontinue文を使用して処理をスキップしてください。
        //
        //外側のループ: 10の倍数の場合
        //2番目のループ: 3の倍数の場合
        //3番目のループ: 2の倍数の場合

        for(int i = 1; i <= 100; i++){
            if(i % 10 == 0){
                continue;
            }

            for(int j = 1; j <= 100; j++){
                if(j % 3 == 0){
                    continue;
                }

                for(int k = 1; k <= 100; k++){
                    if(k % 2 == 0){
                        continue;
                    }
                    for(int n = 1; n <= 100; n++){
                        System.out.println(i + ", " + j + ", " + k);
                        break;
                    }
                }
            }

        }

    }
}
