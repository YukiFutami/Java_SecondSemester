import java.util.Arrays;
import java.util.Scanner;

public class spClass_1113_1 {
    public static void main(String[] args){
        // 메뉴를 선택하세요
        // 1. M X N Matrix를 출력
        // 2. 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력
        // 3. 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력
        // 4. 종료

        // 1번 : 사용자로부터 M, N 정수를 입력 받아, M X N Matrix를 출력하세요
        // 예) M : 3, N : 2
        //   * *
        //   * *
        //   * *
        //  예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력

        // 2번: 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력
        // 예) M : 3, N : 3
        //     * *
        //   *   *
        //   * *
        //  예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력


        // 3번: 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력
        // 예) M : 3, N : 3
        //     *
        //   *   *
        //     *
        //  예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력

        Scanner scan = new Scanner(System.in);

        int gameCount = 1;

        int m = 0, n = 0;


        while(true){
            System.out.println("ゲーム回数: " + gameCount);
            System.out.println("=================");
            System.out.println("1. M X N Matrix를 출력");
            System.out.println("2. 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력");
            System.out.println("3. 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력");
            System.out.println("4. 종료");
            System.out.println("=================");
            System.out.print("메뉴를 선택하세요: ");

            System.out.print("메뉴를 입력: ");
            int menu = scan.nextInt();

            String menuLabel = switch(menu){
                case 1 -> "1번 실행";
                case 2 -> "2번 실행";
                case 3 -> "3번 실행";
                case 4 -> "4번 실행";
                default -> "재입력";
            };
            System.out.println(menuLabel);

            if(menu == 4){
                break;
            }

            else if(menu == 1){
                // 1번 : 사용자로부터 M, N 정수를 입력 받아, M X N Matrix를 출력하세요
                // 예) M : 3, N : 2
                //   * *
                //   * *
                //   * *
                //  예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력

            }
            else if(menu == 2){
                System.out.println(2);
            }
            else if(menu == 3){
                System.out.println(3);
            }
            else { // 再入力となったとき、カウントを１減らして、次の＋＋でゲームカウントをそのままに保つ
                gameCount--;
            }
            gameCount++;
        }
    }
}
