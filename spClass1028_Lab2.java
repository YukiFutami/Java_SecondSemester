import java.util.Scanner;

public class spClass1028_Lab2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input1 = 4;
        int input2 = 4;
        int input3 = 6;

        String triangle = "";
        // 삼각형을 만들 수 있나?
        // 응
        if ((input1 + input2) <= input3 || (input1 + input3) <= input2 || (input2 + input3) <= input1) {
            System.out.println("응");
            // すべて同じなら正三角形
            if (input1 == input2 && input2 == input3) {
                triangle = "정삼각형";
            } else if (input1 == input2 || input2 == input3 || input1 == input3) { //　二編が同じなら二等辺三角形
                triangle = "이등삼각형";
            } else {
                triangle = "부등삼각형"; //　全部違ければ不等編三角形
            }

            System.out.println(triangle);

        } else {
            System.out.println("아니"); // 아니 -> 삼각형을 만들 수 없습니다
        }

        //先生のコード　未確認！！！



        sc.close();
    }
}
