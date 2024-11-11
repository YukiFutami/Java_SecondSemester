import java.util.Random;
import java.util.Scanner;

public class spClass_tests6 {
    public static void main(String[] args) {

        // 가위 바위 보 계임을 구현
        // 사용자로부터 "Scissors, Rock, Paper" 를 입력
        // - "Scissors, Rock, Paper" 이외 값은 재입력 처리
        // 컴퓨터는 "Scissors, Rock, Paper" 중 하나를 랜덤하게 선택

        // 결과 값 출력:
        // 예) 1) 승리 - 사용자: 가위, 컴퓨터 : 보

        // コンピューターの勝ち判定
        // "Exit"를 입력하기 전까지 게속하게 게임 실행

        // ボーナス　勝利したら１点、負けたら－１点、
        //　毎ゲームごとに結果を出力しボーナスポイントを表示
        //　連続勝利時、３点追加
        //　点数が７点以上もしくは－７点以下ならゲーム終了
        //　終了時勝敗と点数の表示


        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        String[] cpRandomHand = {"Scissors", "Rock", "Paper" };

        //　点数をカウントする変数を設定、　勝ちと負け
        int score = 0;
        //　보너스 저장
        boolean winMemory = false;

        // 결과
        String result = "";


        while (true) {
            // 사용자로부터 "Scissors, Rock, Paper" 를 입력
            System.out.println("Scissors, Rock, Paper 중에 하나 입력: ");
            String inputUserHand = scan.nextLine();

            // - "Scissors, Rock, Paper" 이외 값은 재입력 처리
            int userHand = switch (inputUserHand) {
                case "Scissors" -> 0;
                case "Rock" -> 1;
                case "Paper" -> 2;
                case "Exit" -> -1;
                default -> 4;
            };

            // if userHand more 0
            if (userHand == 4) {
                System.out.println("재입력");
                continue;
            } else if (userHand == -1) {
                System.out.println("종료");
                break;
            }

            // 컴퓨터는 "Scissors, Rock, Paper" 중 하나를 랜덤하게 선택
            int cpHand = rand.nextInt(cpRandomHand.length);

            if (userHand == cpHand) {
                result = "무승부";
                winMemory = false;
            } else if ((userHand == 0 && cpHand == 1) ||
                    (userHand == 1 && cpHand == 2) ||
                    (userHand == 2 && cpHand == 0)) {
                result = "승리";
                score++;

                //연속 승리 3점 보너스
                if(winMemory){
                    score+= 3;
                }

                winMemory = true;

            } else {
                result = "패배";
                score--;
                winMemory = false;
            }

            if(score >= 7){
                result = "승리";
                break;
            } else if (score <= -7) {
                result = "패배";
                break;
            }

            System.out.println(result + " - 사용자: " + inputUserHand + ", 컴퓨터 : " + cpRandomHand[cpHand]);
            System.out.println("현재 점수: " + score);

        }

        System.out.println("- 사용자 " + result + " : 보너스 점수 " + score + " 점");
    }
}
