public class se_media03_1_6 {
    public static void main(String[] args){

        // 二重の for 文を用いて以下の出力を行ってください。

        int num = 0;
        for(int i = 1; i <= 9; i++){

            if(i <= 5){
                num++;
            } else {
                num--;
            }
            for(int j = 0; j < num; j++){
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
