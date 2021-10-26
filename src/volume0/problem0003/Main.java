package src.volume0.problem0003;

import java.util.Scanner;

/**
 * Problem Set from Volume0
 * Problem Title : 0003:   Is it a Right Triangle?
 */
public class Main {

    private static final String REGEX = " ";   // 区切り文字

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num  = Integer.parseInt(scan.nextLine());

        // 入力受付
        for (int i = 0; i < num; i++) {
            String str  = scan.nextLine();
            String [] numArray = str.split(REGEX);

            // わかりやすく3変数に分解
            int x = Integer.parseInt(numArray[0]);
            int y = Integer.parseInt(numArray[1]);
            int z = Integer.parseInt(numArray[2]);

            // zが最大になるよう調整
            if (z < x) {
                int tmp = z;
                z = x;
                x = tmp;
            }
            if (z < y) {
                int tmp = z;
                z = y;
                y = tmp;
            }

            // x^2 + y^2 = z^2 を満たすかチェックし結果を出力
            String ans = ((x * x) + (y * y) == (z * z)) ? "YES" : "NO";
            System.out.println(ans);
        }

        scan.close();
    }
}
