public class exercise004_039 {
    public static void main(String[] args){

        // 3次元文字列配列が与えられた場合、特定の要素の値を取得するプログラムを書いてください。
        // 例えば、cube[2][1][0] の値は何ですか？

        int[][][] cube = {
                {{1,2,3}, {4,5,6}, {7,8,9}},
                {{11,12,13}, {14,15,16}, {17,18,19}},
                {{21,22,23}, {24,25,26}, {27,28,29}}
        };

        System.out.println(cube[0][1][2]); // 6
        System.out.println(cube[2][1][0]); // 24

    }
}
