public class exercise006_021 {
    public static void main(String[] args){

        // 1から10までの整数を順番に表示するプログラムを作成してください。
        // ただし、3の倍数の場合はループを終了させるようにしてください。

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
            if(i % 3 == 0)break;

        }

    }
}
