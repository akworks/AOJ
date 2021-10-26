package src.volume0.problem0004;

import java.util.Scanner;

/**
 * Problem Set from Volume0
 * Problem Title : 0004:   Simultaneous Equation
 */
public class Main {

    private static final String REGEX = " ";   // 区切り文字

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 入力受付
        while (scan.hasNext()) {
            String str  = scan.nextLine();
            String [] numArray = str.split(REGEX);

            // わかりやすく6変数に分解
            double a = Double.parseDouble(numArray[0]);
            double b = Double.parseDouble(numArray[1]);
            double c = Double.parseDouble(numArray[2]);
            double d = Double.parseDouble(numArray[3]);
            double e = Double.parseDouble(numArray[4]);
            double f = Double.parseDouble(numArray[5]);

            // ax + by = c  *** (1)
            // dx + ey = f  *** (2)
            //
            // (1)をe倍  =>  aex + bey = ce  *** (3)
            // (2)をb倍  =>  bdx + bey = bf  *** (4)
            // (3)-(4)   =>  (ae - bd)x = ce - bf
            //  =>  x = (ce - bf) / (ae - bd)
            double x = (c * e - b * f) / (a * e - b * d);
            double y = (c - a * x) / b;

            // 文字列に変換、小数点以下は3桁
            String xStr = String.format("%.3f", x);
            String yStr = String.format("%.3f", y);

            // 「-0.000」という表示を避けるため変換
            xStr = xStr.equals("-0.000") ? "0.000" : xStr;
            yStr = yStr.equals("-0.000") ? "0.000" : yStr;

            // 整形して出力
            StringBuilder sb = new StringBuilder();
            sb.append(xStr);
            sb.append(REGEX);
            sb.append(yStr);
            System.out.println(sb.toString());
        }

        scan.close();
    }
}
