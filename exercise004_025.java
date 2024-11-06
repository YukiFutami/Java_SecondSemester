public class exercise004_025 {
    public static void main(String[] args){

        // double 型の配列を宣言し、要素数が5の新しい配列を作成し、初期化してください。
        // その後、この配列内の各要素に0.1、0.2、0.3、0.4、0.5といった浮動小数点数を代入してください。

        double[] array = new double[]{0.1, 0.2, 0.3, 0.4,0.5};
        for (int i = 0; i < array.length; i++)System.out.println(i + "番目" + array[i]);

    }
}
