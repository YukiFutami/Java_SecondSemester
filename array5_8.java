import java.util.Random;
import java.util.Scanner;

public class array5_8 {
    public static void main(String[] args){

        // 練習問題 5 - 8
        // 整数を 10個作成し、小さい順に並べ替えて表示するプログラムを作成しなさい。
//        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int[] valueArray = new int[10];


        //　ランダムな値を１０個生成する
        for(int i = 0 ; i < valueArray.length; i++) {
            int rdNum = rd.nextInt(100) + 1;
            System.out.print(rdNum + " ");
        }
        System.out.println();

        //　大小判定
        // for文を使って大小の判定を行う
        // 要素にそれぞれ次の値を比較し、大きければ-1移動（左に移動）、小さければ+1（右に移動）する
        int check = 0;
        for(int i = 0; i < valueArray.length; i++){
            check = valueArray[i]; // いったん要素を変数にコピーする
            if(check >= valueArray[i]){
                for(int j = 0; j < i ; j++){ // iの回数まで繰り返す
                    // 配列の確認している要素まで繰り返し確認する

                }

            }
        }


//            if(rdNum >= valueArray[i]){
//                valueArray[i + 1] = valueArray[i];
//                valueArray[i] = rdNum;
//            } else {
//                valueArray[i] = rdNum;
//            }
//        }
//
//        for(int i = valueArray.length - 1 ; i >= 0; i--){
//            System.out.print(valueArray[i] + " ");
//        }

        /////////////////////// この先GPTに聞いた方法、実践して
//        // 並べ替え
//　　　　　int[] valueArray = {34, 67, 23, 90, 12, 56, 78, 45, 89, 10};
//        Arrays.sort(valueArray);
//
//        // 結果表示
//        for (int num : valueArray) {
//            System.out.print(num + " ");
//        }

        ////　別の方法
//        import java.util.Random;
//
//        public class SortArray {
//            public static void main(String[] args) {
//                Random rd = new Random();
//                int[] valueArray = new int[10];
//
//                // ランダムな値を10個生成し配列に代入
//                System.out.println("ランダムな値:");
//                for (int i = 0; i < valueArray.length; i++) {
//                    valueArray[i] = rd.nextInt(100) + 1; // 1から100のランダムな整数
//                    System.out.print(valueArray[i] + " ");
//                }
//                System.out.println();
//
//                // バブルソートで小さい順に並べ替え
//                for (int i = 0; i < valueArray.length - 1; i++) {
//                    for (int j = 0; j < valueArray.length - 1 - i; j++) {
//                        if (valueArray[j] > valueArray[j + 1]) {
//                            // 要素を入れ替える
//                            int temp = valueArray[j];
//                            valueArray[j] = valueArray[j + 1];
//                            valueArray[j + 1] = temp;
//                        }
//                    }
//                }
//
//                // 並べ替え後の配列を表示
//                System.out.println("小さい順に並べ替え:");
//                for (int num : valueArray) {
//                    System.out.print(num + " ");
//                }
//            }
//        }

    }
}
