public class phoe1_11 {
    public static void main(String[] args){

        // int型変数xが1で初期化されています。
        //xの値をwhile文を用いて2倍していき、その都度値を出力します。
        //xの値が1000を超えた段階でループを終了してください。

        int x = 1;
        while( x <= 1000){
            System.out.println(x);
            x *= 2;
        }
    }
}
