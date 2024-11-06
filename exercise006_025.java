public class exercise006_025 {
    public static void main(String[] args){

        // 26の問題
        // 1から50までの整数を表示する四重のforループを使用したプログラムを作成してください。
        // ただし、以下の条件に合致する場合にcontinue文を使用して処理をスキップしてください。
        //外側のループ: 10の倍数の場合
        //2番目のループ: 3の倍数の場合
        //3番目のループ: 2の倍数の場合

//        for(int i = 1; i <= 50; i++){
//            for(int j = i; j <= 50; j++){
//                for(int k = 0; k <= 50; k++){
//                    for(int m = 0; m <= 50; m++){
//                        if (i % 10 == 0 || j % 3 == 0 || k % 2 == 0){
//                            continue;
//                        }
//                        System.out.println(i + ":" + j + ":" + k + ":" + m);
//                    }
//                }
//            }
//        }
        for(int i = 1; i <= 20; i++){
            if(i % 10 == 0) {
                continue;
            }

            for(int j = 1; j <= 20; j++){
                if(j % 3 == 0){
                    continue;
                }

                for(int k = 0; k <= 20; k++){
                    if(k % 2 == 0){
                        continue;
                    }

                    for(int m = 0; m <= 20; m++){
                        System.out.println(i + ":" + j + ":" + k + ":" + m);
                    }
                }
            }
        }
    }
}
