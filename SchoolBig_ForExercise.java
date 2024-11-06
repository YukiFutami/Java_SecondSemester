public class SchoolBig_ForExercise {
    public static void main(String[] args){

        // for文 とは
        // 同じ処理を指定した回数だけ繰り返し実行する構文
        // 書式

        /* for (初期値 ; 繰り返し条件 ; 更新処理){
            ブロック ここに、条件が成り立つときに繰り返したい処理を書く
        } */

        // for文を利用して"こんにちは"の表示を１０回繰り返す
        int i; //変数を宣言
        for (i = 0; i < 10 ; i++){ // i=0の初期化、 i<10 でiが９になるまでの条件を設定、インクリメントi++で条件が更新されるたびに１追加する
            System.out.println("こんにちは");
        }

        // 変数宣言はfor内で行ってもよい
         // for (int i = 0 ; i < 10 ; i++)

        // breakを使って抜け出す方法
        for (int x = 0 ; x < 5 ; x++){
            if (x == 3){ //このようにして条件式では９までの指定だが、３に到達したらbreakさせることもできる
                break;
            }
            System.out.println("おはよう");
        }

        //continueを使って指定の条件をスキップする方法
        for (int y = 0 ; y < 10 ; y++){
            if (y > 3 && y < 8){ // 0 1 2 3 8 9 を表示する 3より大きく、８より下のため
                continue;
            }
            System.out.println("こんばんは");
        }



    }
}
