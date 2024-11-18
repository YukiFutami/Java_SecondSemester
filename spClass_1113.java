import java.util.Scanner;

public class spClass_1113 {
    public static void main(String[] args) {

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


        // 메뉴를 입력 받아 해당 프로그램 실행 후 다시 메뉴 출력
        Scanner scan = new Scanner(System.in);

        //　ゲームカウント回数 １回目の実行から数える
        int gameCount = 1;

        // 入力値の初期化
        int m, n;

        while (true) {
            // メニュー画面
            System.out.println("ゲーム回数: " + gameCount);
            System.out.println("=================");
            System.out.println("1. M X N Matrix를 출력");
            System.out.println("2. 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력");
            System.out.println("3. 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력");
            System.out.println("4. 종료");
            System.out.println("=================");
            System.out.print("메뉴를 선택하세요: ");

            int menuNum = 0;

            // 入力
            while (true) {
                menuNum = scan.nextInt();
                //　１～３以外の場合
                if (menuNum >= 1 && menuNum <= 4) {
                    break;
                }
                System.out.println("재입력");
            }

            //　例外処理　４の場合
            if (menuNum == 4) {
                System.out.println(menuNum + "종료");
                break;
            }

            while (true) { // 例外処理の組み込み
                System.out.print("M 정수를 입력: ");
                m = scan.nextInt();

                System.out.print("N 정수를 입력: ");
                n = scan.nextInt();

                if (m > 0 && n > 0) {
                    break;
                }

                System.out.println("양수를 입력하세요");
            }

            //　条件式
            // 1번 : 사용자로부터 M, N 정수를 입력 받아, M X N Matrix를 출력하세요
            if (menuNum == 1) {
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("*\t");
                    }
                    System.out.println();
                }
                break;
            }
            // 2번: 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력
            else if (menuNum == 2) {
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {

                        // 左上から右下に対角線上に消える　この時[0][0]. [1][1]...となる
                        if (i == j) {
                            System.out.print(" \t");
                        } else {
                            System.out.print("*\t");
                        }
                    }
                    System.out.println();
                }
            }
            // 3번: 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력
            else {
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        // 左上から右下に対角線上に消える　この時[0][0]. [1][1]...となる
                        if (i == j || i + j == m - 1) {
                            System.out.print(" \t");
                        } else {
                            System.out.print("*\t");
                        }
                    }
                    System.out.println();
                }
            }
        }
        gameCount++;
        scan.close();
    }
}

