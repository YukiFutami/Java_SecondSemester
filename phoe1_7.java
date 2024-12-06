public class phoe1_7 {
    public static void main(String[] args){

        // int型の変数monthが宣言してあります。変数monthは月を表しています。
        // 変数monthの値が1、3、5、7、8、10、12の場合は「○月は31日まであります」と表示し、4、6、9、11の場合は「○月は30日まであります」と表示します。
        //2の場合は「2月は28、または、29日まであります」と表示します。
        //また、変数monthの値が1〜12以外の値の場合は「エラー」と表示してください。
        //条件分岐には必ずswitch文を使用してください。

        int month = 6;
        switch (month){
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println(month + "月は31日まであります");
                break;
            case 4, 6, 9, 11:
                System.out.println(month + "月は30日まであります");
                break;
            case 2:
                System.out.println(month + "月は28、または、29日まであります");
                break;
            default:
                System.out.println("エラー");
        }
    }
}
