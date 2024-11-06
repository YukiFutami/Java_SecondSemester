import java.util.Scanner;

public class SchoolBig_SwitchExercise {
    public static void main(String[] args){

        // JAVAの分岐構文 switch-case

        // 条件値＝値 となる文が複数になる場合switchを使うと効率的である
        // switch(条件値){
        // case 値1:　※ここで使うのは: コロンなので気を付ける
        //      処理1
        //      break;
        // 　　２，３，４と続けられる
        // default
        //      処理X // defaultラベルは一つしか書けない、defaulラベルがない場合はなにも実行せずswitch文を終了する

        // ex)

        Scanner scan = new Scanner(System.in);

        System.out.println("好きな月を入力: ");
        int month = scan.nextInt();

        switch (month){
            case 1:
                System.out.println(month + "月は３１日までです");
                break;
            case 2:
                System.out.println(month + "月は28日までです");
                break;
            case 3:
                System.out.println(month + "月は３１日までです");
                break;
            default:
                System.out.println("何月か入力してください");
        } // breakは必ず必要！
    }
}
