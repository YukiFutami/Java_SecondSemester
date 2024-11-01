

public class practice1_5 {
    public static void main(String args[]){
        // ageを宣言
        int age = -2;


        // 未成年か成人かの判定
        if (age >= 20){
            System.out.println("成人です");
        } else if (age >= 0) {
            System.out.println("未成年です");
            if (age <= 6 || age > 14) {
                System.out.println("今は義務教育を受けていません");
            } else {
                System.out.println(("今は義務教育を受けています"));
            }
        } else {
            System.out.println("Error");
        }

        // 義務教育の判定



    }
}
