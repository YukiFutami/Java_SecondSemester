public class phoe1_8 {
    public static void main(String[] args){

        // 21から29までの数値を調査します。
        //その数値が3から9までの倍数である場合は「○は△の倍数です」と出力します。
        
        
        for(int i = 21; i <= 29; i++){
            
            for(int j = 3; j <= 9; j++ ){

                if(i % j == 0){
                    System.out.println(i + "　は　" + j +"　の倍数です");
                }
            }
        }

    }
}
