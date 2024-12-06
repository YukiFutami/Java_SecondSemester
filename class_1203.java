public class class_1203 {
    static void saySomething(){
        System.out.println("Hi, Today is a good day.");
    }

    static int value(int a, int b){
        return a + b;

    }
    public static void main(String[] args){
        saySomething();

        value(2, 3);
        System.out.println("a + b = " + value(2, 3));

    }
}
