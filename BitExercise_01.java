public class BitExercise_01 {
    public static void main(String[] args){
        // 問題1 : 次の16進数の値に対してビットAND演算を行いなさい。
        //A = 0x5A  B = 0x3F

        int a = 0x5A;
        int b = 0x3F;

        int answer1 = a & b;
        System.out.println("問題１の答え: " + answer1);

        // 問題２ : 次の16進数の値に対してビットOR演算を行いなさい
        // C = 0xA1   D = 0x4B

        int c = 0xA1;
        int d = 0x4B;

        int answer2 = c | d;
        System.out.println("問題2の答え: " + answer2);

        // 問題３ : 次の16進数の値に対してビットXOR演算を行いなさい。
        // E = 0x7C   F = 0x1E
        int e = 0x7c;
        int f = 0x1E;

        int answer3 = e ^ f;
        System.out.println("問題3の答え: " + answer3);

        // 問題４: 次の16進数の値をビット反転（NOT演算）しなさい。
        // G = 0xF3

        int g = 0xF3;

        int answer4 = ~g;
        System.out.println("問題４の答えは: " + answer4);

        // 問題５ : 次の16進数の値を左シフトしなさい（2ビットシフト）
        // H = 0x1C

        int h = 0x1C;
        int answer5 = h << 2;
        System.out.println("問題５の答えは: " + answer5);

        // 問題６ : 次の16進数の値を右シフトしなさい（3ビットシフト）
        // I = 0xC8

        int i = 0xC8;
        int answer6 = i >> 3;
        System.out.println("問題６の答えは: " + answer6);

        // 問題７ : 次の式を計算しなさい
        // J = 0x2A & 0x1F | 0x04

        int j = (0x2A & 0x1F) | 0x04;
        System.out.println("問題７の答えは: " + j);

        // 問題８　: 次の式を計算しなさい。
        // K = ~(0x3B)

        int k = ~(0x3B);
        System.out.println("問題８の答えは: " + k);

        // 問題９ : 次の16進数の値に対して、ビットAND演算を行い、その結果を10進数で表示しなさい。
        // L = 0xB5 M = 0x6A

        int l = 0xB5;
        int m = 0x6A;

        int answer9 = l & m;
        System.out.println("問題9の答えは: " + answer9);

        // 問題10 : 次の16進数の値に対してビットOR演算を行い、結果を16進数で表示しなさい。
        // N = 0x9C  O = 0x47

        int n = 0x9C;
        int o = 0x47;

        int answer10 = n | o;
        System.out.println("問題１０の答えは: " + Integer.toHexString(answer10));
    }
}
