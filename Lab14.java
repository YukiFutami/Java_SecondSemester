import java.util.Random;
import java.util.Scanner;

public class Lab14 {
    public static void main(String[] args) {

        // 사용자로부터 3~7 사이의 정수를 입력 받고 슬롯 개수를 설정
        // 입력 값이 유효하지 않으면 오류 메시지를 출력하고 재입력 요구

        // 사용자로부터 3~7 사이의 정수를 입력
        Scanner scan = new Scanner(System.in);
        int inputNum;

        // 입력 값이 유효하지 않으면 오류 메시지를 출력
        while(true){
            System.out.print("정수를 입력하세요: ");
            inputNum = scan.nextInt();

            if(!(inputNum >= 3 && inputNum <= 7)){
                System.out.println("\n3~7 사이의 정수를 입력하세요.");
            } else {
                break;
            }
        }

        // 세 가지 연산자를{+, -. *}를 가지고 있는 배열을 생성
        char[] array = {'+', '-', '*'};

        // 랜덤 슬롯 결과 생성
        // 입력을 받은 성수만큼 연산자를 무적위로 선택하여 결과 배열 생성
        Random rd = new Random();
        // 저장하는 배열 생성
        char[] rdCharArray = new char[inputNum];

        // for문을 사용해서 입력 정수만큼 랜덤으로 연산자를 저장
        for(int i = 0; i < rdCharArray.length; i++){
            int rdNum = rd.nextInt(array.length); // 연산자 배열 안해서 선택

            // rdNum을 연산자로 변환
            if(rdNum == 0){
                rdCharArray[i] = array[rdNum];
            } else if(rdNum == 1){
                rdCharArray[i] = array[rdNum];
            } else {
                rdCharArray[i] = array[rdNum];
            }
            System.out.print(rdCharArray[i] + ":\t");
        }

        // 연속된 연산자가 두 개일 경우
        // ++, 1점
        // --, -1점
        // **, 2점



    }
}
