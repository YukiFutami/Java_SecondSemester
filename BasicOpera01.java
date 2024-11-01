import java.util.Scanner;

public class BasicOpera01 {
    public static void main(String[] args){


        // name
        Scanner scan = new Scanner(System.in);
        System.out.print("input to your name:");
        String name = scan.nextLine();

        // adresse
        Scanner scan1 = new Scanner(System.in);
        System.out.print("input to your adresse:");
        //String adresse = scan1.nextLine();
        String adresse = scan1.next(); // 改行、スペースで区切りつける

        // age
        Scanner scan2 = new Scanner(System.in);
        System.out.print("input to your age:");
        int age = scan2.nextInt();

        System.out.println("your name : " + name );
        System.out.println("your adress : " + adresse);
        System.out.println("your age : " + age);
    }
}
