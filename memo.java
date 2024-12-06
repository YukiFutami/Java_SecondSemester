public class memo {
    public static void main(String[] args) {

        String[] label = {"[学番: ", "]国語: ", "英語: ", "数学: ", "合計: ", "平均: "};

        int[][] students = new int[3][6];
        students[0][0] = 10;
        students[0][1] = 20;
        students[0][2] = 30;
        students[0][3] = 40;
        students[0][4] = 50;
        students[0][5] = 60;
        int stCount = 1;

        int labelCount = 0;
        if (stCount >= 0) {
            for (int i = 0; i <= stCount; i++) {
                for (int j = 0; j < students[i].length; j++) {
                    System.out.print(label[labelCount] + "\t");
                    labelCount++;
                    System.out.print(students[i][j] + "\t");

                }
            }

        }
    }
}
