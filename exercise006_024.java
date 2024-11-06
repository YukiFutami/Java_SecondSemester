public class exercise006_024 {
    public static void main(String[] args){

        // 1から10までの整数を表示するネストされた2つのforループを使用したプログラムを作成してください。
        // ただし、奇数の場合は表示せずに次の数に進むようにしてください。
        for(int i = 1; i <= 10; i++){
            for(int j = i; j <= 10; j++){
                if(i % 2 != 0 || j % 2 != 0){
                    continue;
                }
                System.out.println(i + ":" + j);
            }

        }
    }
}
