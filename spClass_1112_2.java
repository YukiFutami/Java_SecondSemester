import java.util.Arrays;
import java.util.Scanner;

public class spClass_1112_2 {
    public static void main(String[] args) {

        // Lab 2

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value 1: ");
        int m = sc.nextInt();

        System.out.println("Enter value 2: ");
        int n = sc.nextInt();


        // input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // space
                if (i == j) {
                    System.out.print(" \t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
