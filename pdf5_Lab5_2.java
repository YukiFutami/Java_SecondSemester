import java.util.Scanner;

public class pdf5_Lab5_2 {

    public static void main(String[] args){

        // 学生データを２次元配列で保存
        // 最初の大きさは３行６列で設定
        // 入力データが超過した場合、配列が２倍になる　例えば４人目を入力したら３列から６列になる
        // 大きさが変わった時、既存データは維持
        // 拡大したらメッセージを出力し、新しい列は〷列とメッセージを出力
        // ２：学生成績を入力
        // もし既存の学生と学生番号が同じ場合は、メッセージを出力
        //　既存学生の情報を更新したい場合は更新する、希望しない場合は更新しない
        // 重複がない場合は、そのまま入力
        // 入力が完了したら完了しましたとメッセージを出力する

        Scanner scan = new Scanner(System.in);
        int stCount = 0; // 학생 인원수를 Count
        int[][] students = new int[3][6]; // 학생 저장 배열
        int studentsCount = 0; // 학생 입력수 저장

        //メッセージを出力　繰り返す
        // 4つの選択
        while(true){
            System.out.println("메뉴");
            System.out.println("1, 학생 성적 입력");
            System.out.println("2, 입력된 학생 목록 출력");
            System.out.println("3, 학생 삭재하기");
            System.out.println("4, 종료");

            // Enter user chose
            System.out.print("선택: ");
            int chooseNum = scan.nextInt();

            if(chooseNum == 1){
                // 배열에 공간이 있는지 확인, 없으면 확대
                if(stCount > students.length){
                    // 学生の数が４になった時、配列の数を３倍にする
                    // もし学生カウントが４になったら、新しい配列を作成しそこに既存のデータをコピーする
                    //　そしてもともとの配列を初期化して、新しい配列をコピーする
                    // 既存の配列にデータが映ったら、新しい配列を初期化しておく
                    //　次に入力数が７になった時、再度新しい配列ができる、この繰り返し
                    int arrayCount = 3;
                    int[][] newArray = new int[arrayCount + 3][6]; // 새로운 배열 생성
                    for(int i = 0; i < students.length; i++){
                        for( int j = 0; j < students[i].length; j++){
                            newArray[i][j] = students[i][j];
                        }
                    }
                    students = new int[newArray.length][newArray[0].length];
                    arrayCount += 3;

                    for(int i = 0; i < students.length; i++){
                        for(int j = 0; j < students[i].length; j++){
                            students[i][j] = newArray[i][j];
                        }
                    }

                    for(int i = 0 ; i < newArray.length; i++){
                        for (int j = 0; j < newArray[i].length; j++){
                            newArray[i][j] = 0;
                        }
                    }
                    //現在の列の数を出力
                    System.out.println("현제 행수 :" + arrayCount);
                    // 全て初期化したらカウントを０に戻す
                    stCount = 0;
                }

                // 학생 번호를 이력하고 중복 학번 검중
                System.out.print("학번을 입력하세요: ");
                int stNumber = scan.nextInt();

                // 검중
                for(int i = 0 ; i <= studentsCount; i++){
                    for(int j = 0; j < 1; j++){ // 학번만 확인
                        if(students[i][j] == stNumber){
                            System.out.print("중복된 학번입니다.");
                            System.out.print("덮어쓰기를 희망힙니까? (Y: 덮어쓰기 진행 , Q: 메뉴로 들어가기 ):");
                            String userChoice = scan.next().toUpperCase();
                            // 既存データを更新したい場合は入力画面へ
                            // 更新しない場合はメニュー画面へ戻る
                            switch (userChoice){
                                case "Y":{
                                    System.out.print("국어 성적: ");
                                    int lan = scan.nextInt();
                                    System.out.print("영어 성적: ");
                                    int eng = scan.nextInt();
                                    System.out.print("수학 성적: ");
                                    int mat = scan.nextInt();

                                    int sum = lan + eng + mat;
                                    int ave = sum / 3;

                                    System.out.println("덮어쓰기가완료되었습니다");

                                    students[i][1] = lan;
                                    students[i][2] = eng;
                                    students[i][3] = mat;
                                    students[i][4] = sum;
                                    students[i][5] = ave;

                                    break;
                                }
                                case "Q":{
                                    System.out.println("입력을취소하고메뉴로돌아갑니다.");
                                    break;
                                }
                                default:{
                                    System.out.println("잘못된입력입니다. 다시 학번 재입력해주세요.");
                                }

                            }
                        } else { // 既存データがない場合
                            stCount++;
                            studentsCount++;
                            System.out.println("학생 정보를 입력해주새요");
                            System.out.println("학번: ");
                            int stNum = scan.nextInt();
                            System.out.print("국어 성적: ");
                            int lan = scan.nextInt();
                            System.out.print("영어 성적: ");
                            int eng = scan.nextInt();
                            System.out.print("수학 성적: ");
                            int mat = scan.nextInt();

                            int sum = lan + eng + mat;
                            int ave = sum / 3;

                            students[studentsCount][0] = stNum;
                            students[studentsCount][1] = lan;
                            students[studentsCount][2] = eng;
                            students[studentsCount][3] = mat;
                            students[studentsCount][4] = sum;
                            students[studentsCount][5] = ave;
                            System.out.println("입력이완료되었습니다.");
                        }
                    }
                }
            } else if (chooseNum == 2) {

            } else if (chooseNum == 3) {

            } else if (chooseNum == 4) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("번호가 없습니다. 다시 입력해주세요.");
            }
        }
    }
}
