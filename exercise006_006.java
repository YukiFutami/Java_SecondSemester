public class exercise006_006 {
    public static void main(String[] args){

        // 繰り返し（for文のネスト） 006 問題
        // ネストされたfor文を使用して、1から9までの九九の表を表示するプログラムを作成してください。

        for (int dan = 1; dan <= 9 ; dan++){ // 外側のループ
//            System.out.println(dan + "*" + null + "=" + null);

            // 内側のループ
            for (int n = 1; n <= 9; n++){
                // System.out.print(dan + "*" + n + "=" + (dan * n) + "\t"); //これでも良いが結果が二けたの時左詰めになってしまう
                System.out.print(String.format("%d*%d=%2d\t",dan,n,dan * n)); //こうすることにより右詰めになり見やすい
                /*  %d: 整数をそのまま表示。
                    %2d: 少なくとも2桁のスペースを確保して整数を表示。1桁の数字なら前に空白が入る。
                    %-d: 左揃えで表示する。 デフォルトは右揃え */


                // もし'n'が９になったら間に空白を入れる（改行）
                if (n == 9){
                    System.out.println();
                }
            }
        }

    }
}
