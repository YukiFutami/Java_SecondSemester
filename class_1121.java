import java.util.Arrays;

public class class_1121 {
//    static int[] createintArray(int argSize){
//        return new int[argSize];
//    }
//
//    static float[] getSumAvg(int a, int b, int c) {
//        float result[] = new float[2];
//        result[0] = a + b + c;
//        result[1] = result[0] / 3;
//
//        return result;
//    }
//
//    public static void main(String[] args){
//        int[] bar = createintArray(10);
//        int[] foo = createintArray(5);
//
//        System.out.println(bar.length);
//        System.out.println(foo.length);
//
//        float[] value = getSumAvg(1,2,3);
//        System.out.println("sum: " + value[0]);
//        System.out.println("avg: " + value[1]);

    public static void main(String[] args){
        int[][] bar = new int[3][3];
        int[][][][] foo;

//        bar[0][0] = 10;
//        bar[0][1] = 20;
//        bar[0][2] = 30;
//        bar[1][0] = 40;
//        bar[1][1] = 50;
//        bar[1][2] = 60;
//        bar[2][0] = 70;
//        bar[2][1] = 80;
//        bar[2][2] = 90;
//        System.out.println(Arrays.deepToString(bar));

//　　　　　// これは自分で考えたやつ
//        int count = 10;
//        for(int i = 0; i < bar.length; i++){
//            for(int j = 0; j < bar[i].length; j++){
//                bar[i][j] = count;
//                System.out.print(bar[i][j]);
//                count += 10;
//            }
//            System.out.println();
//        }

//        int value = 10;
//        for(int row = 0; row < bar.length; row++){
//            for(int col = 0; col < bar[row].length; col++){
//                bar[row][col] = value;
//                value += 10;
//            }
//        }
//        System.out.println(Arrays.deepToString(bar));
//
        int[][] kin = new int[3][];
        kin[0] = new int[20];
        kin[1] = new int[40];

        System.out.println(Arrays.deepToString(kin));


    }
}
