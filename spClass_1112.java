import java.util.Scanner;

public class spClass_1112 {
    public static void main(String[] args) {

        // Lab 1
        Scanner sc = new Scanner(System.in);

        int m = 0, n = 0;

        while(true) {
            System.out.println("Enter value 1: ");
            m = sc.nextInt();

            System.out.println("Enter value 2: ");
            n = sc.nextInt();

            // break
            if (m > 0 && n > 0) {
                break;
            }

        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
