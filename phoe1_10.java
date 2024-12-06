public class phoe1_10 {
    public static void main(String[] args){

        // 変数levelは山の段数を表しています。
        //for文をネストして、次の図形を作成してください。
        //なお、山の左側には全角スペースを使用してください。
        //（実行結果は見やすさのため白い四角で表します）

        int level = 5;

        int space = level;

        // 外側（高さ）
        for(int i = 1; i <= level; i++){

            //スペース
            for(int j = 1; j <= space; j++){
                space = space - j;
                System.out.print("*");
            }
            System.out.println( );

//
//
//            //　内側
        }

    }
}
