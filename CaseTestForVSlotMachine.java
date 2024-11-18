public class CaseTestForVSlotMachine {
    public static void main(String[] args) {
        char[] rdCharArray = {'*', '-', '-', '*', '-', '-'};

        // 연속된 연산자가 두 개일 경우
        // ++, 1점
        // --, -1점
        // **, 2점

        // もし２つ続いたらカウントする
//        boolean checkplus = false;
//        boolean checkmult = false;
//        boolean checkStar = false;
//
//        int score = 0; // 点数
//
//        for(int i = 0; i < rdCharArray.length; i++){ // 繰り返して重複を確認する
//            if(rdCharArray[i] == '-'){// もしインデックスにマイナスがあれば
//                if(checkmult){
//                    score --;
//                    checkmult = false;
//                    continue;
//                }
//                checkmult = true;
//                checkplus = false;
//                checkStar = false;
//            }
//            else if(rdCharArray[i] == '+'){
//                if(checkplus){
//                    score++;
//                    checkplus = false;
//                    continue;
//                }
//                checkplus = true;
//                checkmult = false;
//                checkStar = false;
//            }
//            if(rdCharArray[i] == '*'){
//                if(checkStar){
//                    score += 2;
//                    checkStar = false;
//                    continue;
//                }
//                checkStar = true;
//                checkmult = false;
//                checkplus = false;
//            }
//        }
//        System.out.println(score);

        // もし3つ続いたらscore up
        boolean plus = false;
        boolean mult = false;
        boolean Star = false;

        int checkplus = 0;
        int checkmult = 0;
        int checkStar = 0;

        int score = 0; // 点数

        for(int i = 0; i < rdCharArray.length; i++){ // 繰り返して重複を確認する
            if(rdCharArray[i] == '-'){// もしインデックスにマイナスがあれば
                // true判定
                if(mult){
                    checkmult++;
                }

                if(checkmult == 2){
                    score--;
                }
                mult = true;
                // 判定とスコアの計算部分分けるといいかも　＊＊＊＊＊＊＊＊＊＊
            }
//            else if(rdCharArray[i] == '+'){
//                if(checkplus){
//                    score++;
//                    checkplus = false;
//                    continue;
//                }
//                checkplus = true;
//                checkmult = false;
//                checkStar = false;
//            }
//            if(rdCharArray[i] == '*'){
//                if(checkStar){
//                    score += 2;
//                    checkStar = false;
//                    continue;
//                }
//                checkStar = true;
//                checkmult = false;
//                checkplus = false;
//            }
        }
        System.out.println(score);
    }
}
