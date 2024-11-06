public class exercise004_015 {
    public static void main(String[] args){

        // 整数の配列と検索対象の値が与えられた場合、
        // その値が配列内で最初に出現するインデックスを見つけるプログラムを書いてください。

        int[] array = {10, 20, 30, 40, 50, 10, 20, 30, 40, 50};

        // 確認整数
        int checkNum = 50;

        // indexが何番目かを確認する変数
        int count = -1;

        // index番号を指定して、要素の確認をする
        for(int i = 0; i < array.length; i++){
            // count ++;
            if (checkNum == array[i]){
                count = i;
                break;
            }

        }
        System.out.println("Index: " + count + "に指定した整数があります。:" + checkNum);

    }
}
