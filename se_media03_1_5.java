public class se_media03_1_5 {
    public static void main(String[] args){

        // 掛け算九九表を出力するプログラムを作成してください。(文字間隔の調整は “\t”を使います。)

        int dan = 1;
        int num = dan;

        for(int i = dan; i <= 9; i++){

            for (int j = num; j <= 9; j++){
                System.out.printf("%2d\t",  i * j);   // printfを使い"%2d"で右詰めに表示し、数値間はタブで区切る
            }
            System.out.println();
        }
    }
}
