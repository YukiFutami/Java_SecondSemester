public class exercise004_011 {
    public static void main(String[] args){

        // double型の配列変数を宣言し、要素数が10の配列を作成してください。
        // この配列に0から9までのランダムな浮動小数点数を代入し、それらの値を表示してください。

        double[] array = new double[10];

        for(int i = 0; i < 10; i++){
            double num = Math.random();
            array[i] = num * 10.0;
        }

        for(int i = 0; i < array.length; i++){
            System.out.println("array[" + i + "]" + array[i] + "\n");
        }

        // ランダム値が同じ場合比較して再度生成するコードを追加したバージョン
//        public class Exercise004_011 {
//            public static void main(String[] args){
//
//                // double型の配列変数を宣言し、要素数が10の配列を作成
//                double[] array = new double[10];
//
//                for (int i = 0; i < 10; i++) {
//                    double num;
//                    boolean isDuplicate;
//
//                    // 重複がない値が見つかるまでループ
//                    do {
//                        num = Math.random() * 10.0;
//                        isDuplicate = false;
//
//                        // 配列内に同じ値があるか確認
//                        for (int j = 0; j < i; j++) {
//                            if (array[j] == num) {
//                                isDuplicate = true;
//                                break;
//                            }
//                        }
//                    } while (isDuplicate); // 重複していれば再生成
//
//                    // 重複していない値を配列に代入
//                    array[i] = num;
//                }
//
//                // 配列の値を表示
//                for (int i = 0; i < array.length; i++) {
//                    System.out.println("array[" + i + "] = " + array[i]);
//                }
//            }
//        }
    }
}
