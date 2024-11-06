import java.util.Scanner;

public class SchoolBig_Switch02 {
    public static void main(String[] args){

        // 2.  母音の確認するプログラム
        // 好きな文字を入力して、それは母音かを確認して、コンソールに出力する

        String vowel;
        Scanner scan = new Scanner(System.in);

        System.out.println("ひらがなを入力");
        vowel = scan.next();

        switch (vowel){
            case "a":
                System.out.println(vowel + "は母音です");
                break;
            case "i":
                System.out.println(vowel + "は母音です");
                break;
            case "u":
                System.out.println(vowel + "は母音です");
                break;
            case "e":
                System.out.println(vowel + "は母音です");
                break;
            case "o":
                System.out.println(vowel + "は母音です");
                break;
            default:
                System.out.println("母音ではありません");
        }

        scan.close();

        // このやり方は非効率的、berak使わない特徴を生かす！
//                    case "a":
//                    case "i":
//                    case "u":
//                    case "e":
//                    case "o":
//                        System.out.println(vowel + "は母音です");
//                        break;
//                    default:
//                        System.out.println("母音ではありません");

    }
}
