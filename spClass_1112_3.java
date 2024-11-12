import java.util.Scanner;

public class spClass_1112_3 {
    public static void main(String[] args) {

        // Lab 3
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter M: ");
        int m = sc.nextInt();

        System.out.println("Enter N: ");
        int n = sc.nextInt();

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                // space
//                if (i == j || i + j == m - 1) {
//                    System.out.print(" ");
//                } else {
//                    System.out.print("*");
//                }
//            }
//        }


        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i + j == m - 1) {
                    System.out.print(" \t");
                } else {
                    System.out.print("*\t");
                }
            }

            System.out.println();
        }
    }
}
