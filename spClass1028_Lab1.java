import java.util.Scanner;

public class spClass1028_Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 나이 입력
//
//        System.out.print("나이를 입력하세요: ");
//        int userAge = sc.nextInt();

//        // 이용관 판별 후 출력
//        if (userAge <= 12) {
//            System.out.println("어린이 이용관을 사용할 수 있습니다");
//        } else if (userAge >= 13 && userAge <= 18) { // userAge >= 13 && １８歳まで１２歳以下は前のif文にあるのでなくてもよい
//            System.out.println("청소년 이용관을 사용할 수 있습니다");
//        } else if (userAge >= 19) {
//            System.out.println("성인 이용관을 사용할 수 있습니다");
//        } else {
//            System.out.println("나이를 입력하세요");
//        }

        // 違う方法
//        int age = 0;
//        System.out.println("나이를 입력하세요: ");
//        age = sc.nextInt();

//        String ticket = "";
//        if (userAge <= 12){
//            ticket = "어린이 이용관";
//        } else if (userAge >= 13 && userAge <= 18) {
//            ticket = "청소년 이용관";
//        } else if (userAge >= 19) {
//            ticket = "성인 이용관";
//        } else {
//            ticket = "나이를 입력하세요";
//        }
//
//        System.out.println(ticket + "을 사용할 수 있습니다");
//

        //　先生のコード
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("You are negative");
            return;
        }
        // これ以降のif文は同じ

        sc.close();

    }
}
