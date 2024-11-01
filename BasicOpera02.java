public class BasicOpera02 {
    public static void main(String[] args){

        int x = 6;
        int y = 5;

        // +
        int plus = x + y;

        //-
        int minus = x - y;

        // *
        int kakeru = x * y;

        // /
        int waru = x / y;

        System.out.println(plus + "\n" + minus + "\n" + kakeru + "\n" + waru);

        // 解答例
        System.out.println("x = " + x + ", y = " + y + "の時");
        System.out.println("x + y = " + String.valueOf(x + y));
        System.out.println("x - y = " + String.valueOf(x - y));
        System.out.println("x * y = " + String.valueOf(x * y));
        System.out.println("x / y = " + String.valueOf(x / y));

    }
}
