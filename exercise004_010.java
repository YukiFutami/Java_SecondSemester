public class exercise004_010 {
    public static void main(String[] args){

        // 文字列の配列変数を宣言し、好きな5つの都市の名前を含む配列を作成してください。
        // その後、この配列内の都市名をループを使用して表示してください。

        String[] array = {"London", "DC", "Sidney", "Tokyo", "Rome"};

        for (int i = 0; i < array.length; i++){
            System.out.println("array [" + i + "] = " + array[i]);
        }

    }
}
