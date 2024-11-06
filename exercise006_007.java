public class exercise006_007 {
    public static void main(String[] args) {

        // 繰り返し（for文のネスト） 007 問題
        // ネストされたfor文を使用して、下向きの三角形を表示するプログラムを作成してください。
        // 例えば、入力が5の場合、次のように表示されるものとします。


        // まず上向き三角形を作る　左詰め三角形の上向きの時はスペースを考えない
//        int hight = 5; //高さ５に指定

//        for (int i = 1; i <= hight; i++) { // iは行の数, 繰り返しは高さ分、i++で行を１ずつ追加
//
//            for (int star = 1; star <= i ; star++){ // 行番号iに合わせて、その行にはi個の＊を出力する
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

        // 左詰め逆三角形を作る
        int rows = 5; // 行数を指定

        for (int i = rows; i >= 1; i--) { //
            for (int j = 1; j <= i; j++) { //行のアスタリスクの数を管理
                // "*"を表示
                System.out.print("*");
            }
            // 1つの行を表示したら改行する
            System.out.println();
        }
    }
}
