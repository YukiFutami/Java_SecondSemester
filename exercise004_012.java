public class exercise004_012 {
    public static void main(String[] args){

        // 文字列の配列変数を宣言し、Javaの予約語（キーワード）のいくつかを含む配列を作成してください。
        // その後、この配列内の予約語を表示してください。

        String[] array;
        array = new String[3];

        array[0] = "publis";
        array[1] = "static";
        array[2] = "void";

        for(int i = 0; i < array.length; i++){
            System.out.println("array [" + i + "] = " + array[i]);
        }

    }
}
