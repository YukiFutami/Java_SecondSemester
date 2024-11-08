import java.util.Scanner;

public class spClass1023 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // 入力を受け取りたいときはScannerクラスを使う

//        // short
//        short barShort = sc.nextShort();
//
//        // int
//        int barInt = sc.nextInt();
//
//        // long
//        long barLong = sc.nextLong();
//
//        // float
//        float barFloat = sc.nextFloat();
//
//        // double
//        double barDouble = sc.nextDouble();
//
//        // char
//        char barChar = sc.next().charAt(0); // next() のあとに charAt がある
//        // nextはString型
//
//        // String
//        String barString = sc.nextLine();
//
//        // boolean
//        boolean barBoolean = sc.nextBoolean();
//
//        System.out.println("world");
//        System.out.println("hello");


//        String bar = sc.next(); // nextはスペースまでの文字列を取得
//        System.out.println(bar); // hello
//
//        sc.nextLine(); // buffer flushing
//
//        String foo = sc.nextLine(); // nextLineはEnter（改行）するまでの文字列を取得
//        System.out.println(foo); // world

        // 上二つのコードを実行すると　
        // hello world　これは入力値
        // hello　出力値
        // 　world　出力値　なぜhelloが出力されないのか　
        // →　next()で改行されたデータをそのままに持ってきてしまい、改行からスタートしてしまうため　
        // あいだにsc.nextLine()を挟むことで解消される

// ***********************************************************
        // 文字を二つキーボードから受け取る　同じ文字列なら"yes"　違うなら“no“を出力
//        String userInput1 = sc.next();
//        String userInput2 = sc.next();
//
//        System.out.println(userInput1 + ":" + userInput2);

//        if (userInput1.equals(userInput2)) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }

// ************************************************************
//        // 文字を受け取り'hello'なら"Yes"、値がければ"No"を出力する
//        String userInput1 = sc.next();
//
//        if (userInput1.equals("hello")){
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
// ************************************************************
        // A~Zの文字を一つ受け取る　
        // 大文字は小文字に、小文字は大文字に出力するプログラムを作成
//        char inputAlp = sc.next().charAt(0);
//
//        if (Character.isUpperCase(inputAlp)){
//            System.out.println(Character.toLowerCase(inputAlp));
//        } else if (Character.isLowerCase(inputAlp)){
//            System.out.println(Character.toUpperCase(inputAlp));
//        } else {
//            System.out.println("Error");
//        }

        // 解説コード
        // byte inputValue = (byte) sc.next().charAt(0); //こうできる
        byte inputValue = sc.nextByte(); // -128 ~ 127 はそのまま出力されるが　128はエラーになる
        System.out.println(inputValue);

    }
}
