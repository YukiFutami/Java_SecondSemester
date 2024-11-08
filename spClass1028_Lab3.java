import java.util.Scanner;

public class spClass1028_Lab3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();

        System.out.println("Enter you want to go to the event code");
        String eventCode = scan.next();

        System.out.println("Enter you want to go to on date");
        int reservedDate = scan.nextInt();
        if (reservedDate >= 1 && reservedDate <= 30){
            switch (eventCode){
                case "E1":
                    if (age >= 18){
                        System.out.println("Reservation Completed");
                    } else {
                        System.out.println("Wrong age");
                    }
                    break;
                case "E2":
                    if (reservedDate % 2 == 0){
                        System.out.println("Reservation Completed");
                    } else {
                        System.out.println("Wrong date");
                    }
                    break;
                case "E3":
                    if (age >= 16 && reservedDate % 7 == 0){
                        System.out.println("Reservation Completed");
                    } else {
                        System.out.println("Wrong date");
                    }break;
                default:
                    System.out.println("Wrong event code");
            }
        } else {
            System.out.println("Wrong reserved date");
        }
        scan.close();

    }
}
