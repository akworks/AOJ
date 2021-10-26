package src.volume0.problem0002;

import java.util.Scanner;

/**
 * Problem Set from Volume0
 * Problem Title : 0002:   Digit Number
 */
public class Main {

    private static final String REGEX = " ";   // 区切り文字

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 入力受付
        while (scan.hasNext()) {
            String str  = scan.nextLine();
            String [] numArray = str.split(REGEX);

            // 和を求める
            long sum = Long.parseLong(numArray[0]) + Long.parseLong(numArray[1]);

            // 文字列にし、文字数をカウント (0の場合のみ文字列長0にする)
            String sumStr = (sum == 0) ? "" : Long.valueOf(sum).toString();

            System.out.println(sumStr.length());
        }

        scan.close();
    }
}
