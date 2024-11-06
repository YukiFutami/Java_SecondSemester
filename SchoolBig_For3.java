public class SchoolBig_For3 {
    public static void main(String[] args){

        // S = 1 + 1.2 + 1.2.3 + ... + 1.2.3.nを計算する
        // 問題:S = 1 + 1.2 + 1.2.3 + ... + 1.2.3.nを計算する(n > 0)。

        // nの宣言
        int n = 7;

        // Sの宣言
        int S = 0;

        // countの宣言
        int count = 1;

        for (int i = 1; i <= n; i++){
            count *= i;
            S += count;
        }

        System.out.println("n = " + n + "に対して");
        System.out.println("結果は" + S);


    }
}
