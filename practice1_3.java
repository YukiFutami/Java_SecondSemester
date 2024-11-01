public class practice1_3 {
    public static void main(String[] args) {

        // short型の変数s1を宣言し、65を代入してください
        short s1;
        s1 = 65;

        // s1 の値を出力してください。
        System.out.println(s1);

        // byte型の変数 b を宣言し、変数 s1 の値を代入してください。
        byte b ;
        b = (byte) s1;

        // b の値を出力してください。
        System.out.println(b);

        // char型の変数 c を宣言し、変数 b の値を代入してください。
        char c;
        c = (char) b;

        // c の値を出力してください。
        System.out.println(c);

        // short型の変数 s2 を宣言し、変数 s1 と b を足した値を代入してください。
        short s2;
        s2 = (short)(s1 + b);
        // ********この部分解けず！！

        // s2 の値を出力してください。
        System.out.println(s2);
    }
}
