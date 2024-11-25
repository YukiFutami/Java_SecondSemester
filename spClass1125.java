import java.util.Arrays;
import java.util.Scanner;

public class spClass1125 {
    public static void main(String[] args) {

        //２次元配列　学生成績計算機
        //　メニューを出力
        Scanner scan = new Scanner(System.in);

        // students count
        float[][] students = new float[3][6];
        int studentCount = 0;

        String[] names = {"학번", "국어", "영어", "수학", "합게", "평균"};

        while(true){
            System.out.println("메뉴");
            System.out.println("1: 학생 정적 입력");
            System.out.println("2: 입력된 학생 목록 출력");
            System.out.println("3: 학생 삭제하기");
            System.out.println("4: 종료");
            int choice = scan.nextInt();

            //　メニューは繰り返す
            if(choice <= 0 || choice > 4){
                System.out.println("“잘못된 입력입니다. 다시 선택해주세요");
                continue;
            }
            //　メニュー１：学生成績入力
            else if(choice == 1){
                System.out.print("학번을 입력하세요:");
                float stNum = scan.nextFloat();
                System.out.print("국어 성적: ");
                float kokugo = scan.nextFloat();
                System.out.print("영어 성적: ");
                float eng = scan.nextFloat();
                System.out.print("수학 성적: ");
                float math = scan.nextFloat();

                float sum = kokugo + eng + math;
                float ave = sum/ 3;

                // 여기서 배열에 저장
                for (int i = studentCount; i < students.length; i++) {
                    for (int j = 0; j < students[i].length; j++) {
                        if(j == 0) students[i][j] = stNum;
                        else if(j == 1) students[i][j] = kokugo;
                        else if(j == 2) students[i][j] = math;
                        else if(j == 3) students[i][j] = eng;
                        else if(j == 4) students[i][j] = sum;
                        else if(j == 5) students[i][j] = ave;
                        System.out.print(students[i][j]);
                        System.out.print(" : ");
                    }
                    break;
                }
                studentCount++;
                System.out.println("입력이 완료되었습니다.");
            }
            //　メニュー２：入力された学生の目録を出力
            else if (choice == 2) {
                for(int i = 0; i < studentCount; i++){
                    for (int j = 0; j < students[i].length; j++) {
                        System.out.print(students[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
            //　メニュー３：学生データを削除
            else if (choice == 3) {
                for (int i = 0; i < studentCount; i++) {
                    for (int j = 0; j < students[i].length; j++) {
                        System.out.print(students[i][j] + "\t");
                    }
                    System.out.println();
                }
                while(true){
                    System.out.println("삭제할 학생의 학번을 입력");
                    float delateSut = scan.nextFloat();
                    for(int i = 0; i < students.length; i++){
                        for(int j = 1; j < students[i].length; j++){
                            if(delateSut == -1) {
                                break;
                            }
                            else if(delateSut != j){
                                System.out.print("해당 학번이 존재하지 않습니다. 다시 입력해주세요.");
                                continue;
                            }
                            else if (delateSut == j){
                                for(int k = 0; k < students[i].length - i; i++){
                                    students[i][j] = students[i][j + i];
                                }
                                for(int l = 0; l < students.length; l++){
                                    for(int m = 0; m < students[l].length; m++){
                                        System.out.print(students[l][m] + "\t");
                                    }
                                    System.out.println();
                                }
                            }
                        }
                    }
                }


            }


            //　メニュー４：プログラム終了
            else if(choice == 4){
                System.out.println("프로그램 종료");
                break;
            }



        }



        //　floatを使用する
        //　２時配列のサイズは３行６列
        //　行　学生データ数
        //　列　科目


        //　メニュー２：入力された学生の目録を出力



    }
}
