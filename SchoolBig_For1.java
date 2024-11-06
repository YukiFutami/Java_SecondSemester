public class SchoolBig_For1 {
    public static void main(String[] args){

        // 問題:P = 1.3.5...(2n+1)を計算する（n>0）
        //  奇数の積を計算するためのコード 具体的な式はP = 1*3*5*...(2n+1)となる
        int n = 5;
        long result = 1; // 掛け算なので０ではなく１にする、０をかけると０になるため

        // 式を計算する
        for (int i = 0; i <= n ; i++){
            result *= (2 * i + 1); // result = result * (2 * i + 1)と同様の式
        }

        System.out.println("n = " + n + "において,");
        System.out.println("1.3.5...(2n+1)= " + result );

    }
}
/*
複合代入演算子の一覧
+= : 足して代入 → a += b は a = a + b と同じ
-= : 引いて代入 → a -= b は a = a - b と同じ
*= : 掛けて代入 → a *= b は a = a * b と同じ
/= : 割って代入 → a /= b は a = a / b と同じ
%= : 余りを計算して代入 → a %= b は a = a % b と同じ
 */