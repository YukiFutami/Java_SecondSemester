import java.util.Scanner;

public class Lab5_1_gpt {
    public static void main(String[] args) {

        String[] label = {"[学番: ", "]国語: ", "英語: ", "数学: ", "合計: ", "平均: "};
        Scanner scan = new Scanner(System.in);
        float[][] students = new float[3][6];
        int stCount = -1;

        while (true) {
            printMenu(); // メニューの表示

            int choice = scan.nextInt();

            if (choice == 1) {
                if (stCount >= students.length - 1) {
                    System.out.println("登録可能な学生数の上限に達しました");
                    continue;
                }
                stCount = inputStudentData(students, stCount, scan);
            } else if (choice == 2) {
                displayStudentData(students, stCount, label);
            } else if (choice == 3) {
                stCount = deleteStudent(students, stCount, scan);
            } else if (choice == 4) {
                System.out.println("プログラム終了");
                break;
            } else {
                System.out.println("入力値が間違っています、再度入力してください");
            }
        }
    }

    // メニュー表示メソッド
    private static void printMenu() {
        System.out.println("メニュー");
        System.out.println("1: 学生成績入力");
        System.out.println("2: 入力された学生の目録を出力");
        System.out.println("3: 学生削除");
        System.out.println("4: 終了");
        System.out.print("選択: ");
    }

    // 学生成績入力メソッド
    private static int inputStudentData(float[][] students, int stCount, Scanner scan) {
        System.out.print("学番: ");
        float stNum = scan.nextFloat();
        System.out.print("国語: ");
        float lng = scan.nextFloat();
        System.out.print("英語: ");
        float eng = scan.nextFloat();
        System.out.print("数学: ");
        float mat = scan.nextFloat();

        float sum = lng + eng + mat;
        float ave = sum / 3;
        stCount++;

        students[stCount][0] = stNum;
        students[stCount][1] = lng;
        students[stCount][2] = eng;
        students[stCount][3] = mat;
        students[stCount][4] = sum;
        students[stCount][5] = ave;

        System.out.println("入力が完了しました");
        return stCount;
    }

    // 学生成績表示メソッド
    private static void displayStudentData(float[][] students, int stCount, String[] label) {
        if (stCount >= 0) {
            for (int i = 0; i <= stCount; i++) {
                int labelCount = 0;
                for (int j = 0; j < students[i].length; j++) {
                    System.out.print(label[labelCount]);
                    System.out.print(students[i][j] + "\t");
                    labelCount++;

                    if (labelCount == label.length) {
                        labelCount = 0;
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("入力された学生情報はありません");
        }
    }

    // 学生削除メソッド
    private static int deleteStudent(float[][] students, int stCount, Scanner scan) {
        if (stCount < 0) {
            System.out.println("削除可能な学生がいません");
            return stCount;
        }

        System.out.print("削除したい学番を入力してください (-1でキャンセル): ");
        float delStNum = scan.nextFloat();

        if (delStNum == -1) {
            System.out.println("削除操作をキャンセルしました");
            return stCount;
        }

        boolean found = false;
        for (int i = 0; i <= stCount; i++) {
            if (students[i][0] == delStNum) {
                found = true;

                for (int j = i; j < stCount; j++) {
                    for (int k = 0; k < students[j].length; k++) {
                        students[j][k] = students[j + 1][k];
                    }
                }

                for (int k = 0; k < students[stCount].length; k++) {
                    students[stCount][k] = 0;
                }
                stCount--;
                System.out.println("削除が完了しました");
                break;
            }
        }

        if (!found) {
            System.out.println("該当する学番が見つかりません");
        }

        return stCount;
    }
}
