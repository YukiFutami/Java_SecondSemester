import java.time.MonthDay;

public class switchExpression_Exercise {
    public static void main(String[] args){

//       int day = 2;
//
//       switch (day){
//           case 1 -> System.out.println("Mon");
//           case 2 -> System.out.println("Thu");
//           case 3 -> System.out.println("Wed");
//           case 4 -> {
//               System.out.println("Thr");
//               System.out.println("ringo"); //複数の記述も可能
//           }
//           case 5 -> System.out.println("Fri");
//           default -> System.out.println("Error");
//       }

       // switch式は必ず戻り値が必要になる
        // 例外がスルーされる可能性があるためdefaultは必ずあったほうが良い

        int age = 50;
       System.out.println("Age is " +
               switch (age){
                   case 10: yield  "kid";
                   case 20: yield  "adult";
                   case 50: yield  "old";
                   default: yield  "Error";
               } );
        int x = 50;
        System.out.println("X is " +
                switch (age){
                    case 10 -> "aa";
                    case 20 -> "bb";
                    case 50 -> "cc";
                    default -> "Error";
                } );





    }
}
