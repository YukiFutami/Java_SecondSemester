public class practice1_4 {
    public static void main(String[] args) {
        // value変数の宣言、初期化
        int value = 20;

        System.out.println("Value: " + value);

        // if文　偶数、奇数の確認
        if (value % 2 == 0 ){
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }

        // if文　倍数の確認
//        if (value % 3 == 0 ){
//            System.out.println("３の倍数です");
//        } else if (value % 4 == 0 ){
//            System.out.println("４の倍数です");
//        } else if (value % 5 == 0 ){
//            System.out.println("5の倍数です");
//        }
        if (value % 3 == 0 ){
            System.out.println("３の倍数です");
        }
        if (value % 4 == 0 ){
            System.out.println("４の倍数です");
        }
        if (value % 5 == 0 ){
            System.out.println("5の倍数です");
        }
    }

}
