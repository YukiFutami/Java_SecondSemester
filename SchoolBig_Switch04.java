public class SchoolBig_Switch04 {
    public static void main(String[] args){

        // 4.  正しい選択肢を選ぶゲーム
        // 問題に応じて、選択肢ア、イ、ウ、エ選択肢の中から選び、正しければ、「正解」を、間違えたら「不正解」をコンソールに出力する

        char answer = 'i';

        switch (answer){
            case 'a':
                System.out.println("正解");
                break;
            case 'i':
            case 'u':
            case 'e':
            case 'o':
                System.out.println("不正解");
                break;
            default:
                System.out.println("正しい文字を入力してください");
        }

    }
}
