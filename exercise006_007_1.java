public class exercise006_007_1 {
    public static void main(String[] args){

        // 繰り返し（for文のネスト） 007 問題
        // ネストされたfor文を使用して、下向きの三角形を表示するプログラムを作成してください。
        // 例えば、入力が5の場合、次のように表示されるものとします。

        // 高さ
        int height = 5;

//        //タテ
//        for (int x = 1; x <= height; x++){
//            // ヨコ
//            for (int y = 1; y <= x; y++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // こっからが問題の回答
        // タテ
        for (int x = height ; x >= 1; x--){
            // ヨコ
            for (int star = 1; star <= x; star++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
