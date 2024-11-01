public class BitMaskGpt {
    public static void main(String[] args){

        // 問題1 : IPアドレスのマスキング
        //次のIPアドレスから、サブネットマスク 255.255.255.0 を使ってネットワークアドレスを求めなさい。
        //IPアドレス: 192.168.1.100


        // Ipアドレスのオクテット
        int myIpAddress1 = 192;
        int myIpAddress2 = 168;
        int myIpAddress3 = 1;
        int myIpAddress4 = 100;

        // サブマスクのオクテット
        int subNetMask1 = 255;
        int subNetMask2 = 255;
        int subNetMask3 = 255;
        int subNetMask4 = 0;

        // 各オクテットにビットAND演算子を実行
        int networkAddress1 = myIpAddress1 & subNetMask1;
        int networkAddress2 = myIpAddress2 & subNetMask2;
        int networkAddress3 = myIpAddress3 & subNetMask3;
        int networkAddress4 = myIpAddress4 & subNetMask4;

        // 出力
        System.out.println("ネットワークアドレス: " +
                networkAddress1 + "." +
                networkAddress2 + "." +
                networkAddress3 + "." +
                networkAddress4 + ".");

    }
}

/*
IPアドレスのマスキングによるネットワークアドレスの計算方法は、以下の手順に従います。基本的に、IPアドレスとサブネットマスクの各ビットを ビットAND演算 してネットワークアドレスを求めます。

手順
IPアドレスとサブネットマスクを2進数に変換 します。
ビットごとにAND演算 を行います（1と1の場合のみ1、それ以外は0）。
得られた2進数を10進数に変換 して、ネットワークアドレスを得ます。
例：IPアドレス 192.168.1.100 とサブネットマスク 255.255.255.0
ステップ1: 2進数に変換
まず、IPアドレスとサブネットマスクを2進数に変換します。

IPアドレス: 192.168.1.100

192 → 11000000
168 → 10101000
1 → 00000001
100 → 01100100
IPアドレス (2進数):

코드 복사
11000000.10101000.00000001.01100100
サブネットマスク: 255.255.255.0

255 → 11111111 (各オクテット)
0 → 00000000
サブネットマスク (2進数):

코드 복사
11111111.11111111.11111111.00000000
ステップ2: AND演算を実施
各ビットでAND演算を行います。

lua
코드 복사
  IPアドレス:      11000000.10101000.00000001.01100100
  サブネットマスク: 11111111.11111111.11111111.00000000
  ------------------------------------------------------
  ネットワークアドレス: 11000000.10101000.00000001.00000000
ステップ3: 10進数に変換
得られた2進数を10進数に戻します。

11000000 → 192
10101000 → 168
00000001 → 1
00000000 → 0
ネットワークアドレス: 192.168.1.0

結論
IPアドレス 192.168.1.100 にサブネットマスク 255.255.255.0 を適用すると、ネットワークアドレスは 192.168.1.0 になります。

このように、IPアドレスとサブネットマスクをAND演算し、その結果をネットワークアドレスとして得ます。

 ＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊

 別のやり方
 もちろん、あなたの提案した方法、すなわち、各オクテットを2進数文字列に変換して連結し、その後ビット演算を行うという方法のコード例も提供できます。ただし、文字列操作により少し複雑になります。

以下はその手法を使ったサンプルコードです。

提案された方法によるコード例
java
코드 복사
public class BitExercise_03 {
    public static void main(String[] args) {
        // IPアドレスのオクテット
        int myIpAddress1 = 192;
        int myIpAddress2 = 168;
        int myIpAddress3 = 1;
        int myIpAddress4 = 100;

        // サブネットマスクのオクテット
        int subnetMask1 = 255;
        int subnetMask2 = 255;
        int subnetMask3 = 255;
        int subnetMask4 = 0;

        // 2進数に変換して8ビットの長さにパディング
        String ipBinary = String.format("%8s", Integer.toBinaryString(myIpAddress1)).replace(' ', '0') +
                          String.format("%8s", Integer.toBinaryString(myIpAddress2)).replace(' ', '0') +
                          String.format("%8s", Integer.toBinaryString(myIpAddress3)).replace(' ', '0') +
                          String.format("%8s", Integer.toBinaryString(myIpAddress4)).replace(' ', '0');

        String subnetBinary = String.format("%8s", Integer.toBinaryString(subnetMask1)).replace(' ', '0') +
                              String.format("%8s", Integer.toBinaryString(subnetMask2)).replace(' ', '0') +
                              String.format("%8s", Integer.toBinaryString(subnetMask3)).replace(' ', '0') +
                              String.format("%8s", Integer.toBinaryString(subnetMask4)).replace(' ', '0');

        // 32ビットのバイナリ文字列を整数に変換してビットAND演算を実行
        long ipAddressLong = Long.parseLong(ipBinary, 2);
        long subnetMaskLong = Long.parseLong(subnetBinary, 2);
        long networkAddressLong = ipAddressLong & subnetMaskLong;

        // 結果を再び2進数に変換し、各オクテットに分割
        String networkBinary = Long.toBinaryString(networkAddressLong);
        // 32ビットの長さにパディング
        networkBinary = String.format("%32s", networkBinary).replace(' ', '0');

        // 各オクテットに分割して10進数に戻す
        int network1 = Integer.parseInt(networkBinary.substring(0, 8), 2);
        int network2 = Integer.parseInt(networkBinary.substring(8, 16), 2);
        int network3 = Integer.parseInt(networkBinary.substring(16, 24), 2);
        int network4 = Integer.parseInt(networkBinary.substring(24, 32), 2);

        // 結果を表示
        System.out.println("ネットワークアドレス: "
            + network1 + "."
            + network2 + "."
            + network3 + "."
            + network4);
    }
}
説明:
2進数変換とパディング:

Integer.toBinaryString() を使用して、各オクテットを2進数に変換しますが、結果は通常、先頭のゼロが省略されます。したがって、String.format("%8s", ...) を使って8ビットの長さにゼロで埋め、必要な長さに調整しています。
バイナリ文字列の連結:

各オクテットの2進数文字列を連結して、1つの32ビットのバイナリ文字列を作成します。
ビットAND演算:

バイナリ文字列を Long.parseLong(binaryString, 2) で10進数の整数に変換し、ビットAND演算を行います。
結果の表示:

AND演算後の結果を再度2進数に変換し、32ビット長にパディングしてから、各オクテット（8ビットごと）に分割して、10進数に戻し、最終的なネットワークアドレスとして表示します。
出力結果:
makefile
코드 복사
ネットワークアドレス: 192.168.1.0
メリット・デメリット:
メリット: 提案されたやり方を忠実に再現しており、手作業でバイナリ操作を行う方法の学習には役立ちます。
デメリット: この方法は計算効率が低く、複雑です。実際のネットワークアドレス計算にはビット演算を直接使った方法の方が一般的です。
ただし、この方法もコンピュータのバイナリ操作を理解する上で役立つ良い演習です。



 */