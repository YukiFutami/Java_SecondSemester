import java.util.Scanner;

public class spClass1030_01 {
    public static void main(String[] args) {
        // キーボードから整数Nを入力
        //　Nこの　INT型元素を持っている１次元配列を作成せよ
        //ただし、　Nの値は１から１０まで、これ以外の場合は再入力をする
        Scanner scan = new Scanner(System.in);
        // 배열 성언
        int[] nList; //外で宣言することで、いつでも使える、もしwhileやif文で宣言した場合外では使えない
        // 宣言することで最後の配列の分に適応できる
        int n = 0;

        while (true){

            // 키보드로부터 정수 N를 입력 받아
            System.out.println("정수 입력 : ");
            n = scan.nextInt();

            // 단, N 값을 1 이상 10 이하이미, 이외 값이 입력 될 경우 재입력 실시
            if (n >= 1 && n <= 10) {
                //　N개의 int값 원소를 가지는, 1자원 배열을 작설하시오
//                nList = new int[n];　　//外に持ってきたほうが良い
//                System.out.println(nList.length);
                break;
            } //　else {  // else는 필요 없음
//                System.out.println("재입력");
//            }
        }
        nList = new int[n]; //外に持ってきたほうが良い
        System.out.println(nList.length);
        scan.close();

        // *********************************************************

        // Task 1
        // 정수 N 입력 받는다
        // 만약 N 값이 N > 10 또는 N < 1 재입력

        // Task 2
        // N개에 int형 원소를 가지는 1차원 배열 생성

        int inputValue = 0;
        while (true){
            inputValue = scan.nextInt();

            if (inputValue >= 1 && inputValue <= 10) {
                break;
            }
        }
        int bar[] = new int[inputValue];
    }
}
