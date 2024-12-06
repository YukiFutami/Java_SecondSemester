public class array5_2 {
    public static void main(String[] args){

        // 練習問題 5 - 2
        // 次のプログラムを作成しなさい。
        // 10 個の数値を入力する。
        // 入力された順番と逆の順番で 10 個の数値を表示する。

        int[] num = new int[10];
        for(int i = 0 ; i < num.length; i++){
            num[i] = i + 1;
        }

        // num.lengthは１０だがindexは９までしかない
        for(int  i = num.length - 1; i >= 0 ; i--){
            System.out.print(num[i] + "\t");
        }


    }
}
