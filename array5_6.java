public class array5_6 {
    public static void main(String[] args){

        // 練習問題 5 - 6
        // 九九表を表示する
        int[][] kuku = new int[10][10];

        for(int value = 1; value < kuku.length; value++){
            // 段
            for (int dan = 1 ; dan < kuku[value].length; dan++){
                int result = value * dan;
                kuku[value][dan] = result;
            }
        }

        for(int i = 1; i < kuku.length; i++){
            System.out.print(i + "の段\t");
            for(int j = 1; j < kuku[i].length; j++){
                System.out.printf("%2d\t", kuku[i][j]);
            }
            System.out.println();
        }

        //　問題そのまま解いたやつ
//        for(int value = 1; value < 10; value++){
//            System.out.print(value + "の段\t");
//            // 段
//            for (int dan = 1 ; dan < 10; dan++){
//                int result = value * dan;
//                System.out.println(value + " * " + dan + " = " + result);
//            }
//            System.out.println();
//        }


    }
}
