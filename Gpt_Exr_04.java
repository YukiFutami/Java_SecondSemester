import java.util.Random;

public class Gpt_Exr_04 {
    public static void main(String[] args){

        // 練習問題4: すごろくゲーム
        // プレイヤーは1〜6の範囲でサイコロを振って、出た目に応じて進みます。
        // ゴールは30マス先とし、進んだ場所に応じて「進む」「戻る」などのイベントをランダムに発生させます。
        // プレイヤーがゴールに到達するまで繰り返しサイコロを振り、進んだ場所に応じたメッセージを表示します。
        // ヒント: サイコロの目をランダムで決め、進む先に「進む」「戻る」などの処理を加えます。
        Random rd = new Random();


        // ゴール地点は３０
        int goal = 30;
        int gameCount = 1;
        int userPosition = 0;

        while (true){
            System.out.println("プレイ回数" + gameCount);
            // ユーザーのサイコロを振り、進む
            int userSai = rd.nextInt(6) + 1;
            System.out.println("サイコロの数: " + userSai);

            // 進んだ場所に応じて、進む、戻る、止まる（オプションなし）をランダムに発生させる
            int randomPosition = rd.nextInt(3);

            String option =  switch (randomPosition){
                case 0 -> {
                    userPosition++;
                    yield "進む";
                }
                case 1 -> {
                    userPosition--;
                    yield  "戻る";
                }
                case 2 -> {
                    yield  "留まる";
                }
                default -> "Error";
            };
            // 進んだ数とオプションの表示、現在地を表示
            userPosition += userSai;
            System.out.println("進んだマスの指示 <" + option + "> 現在地: " + userPosition);

            gameCount++;

            // 上記までをゴールにつくまで繰り返す
            // ゴールしたら終了
            if(userPosition >= goal){
                break;
            }
        }

    }
}
