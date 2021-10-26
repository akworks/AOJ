package src.volume0.problem0001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Problem Set from Volume0
 * Problem Title : 0001:   List of Top 3 Hills
 */
public class Main {

    private static final int MNT_NUM = 10;  // 入力の山の数
    private static final int OUT_NUM = 3;   // 出力する数

    public static void main(String[] args) {

        // 山のList
        List <Integer> mntList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        // 入力受付
        for (int i = 0; i < MNT_NUM; i++) {
            String str = scan.nextLine();
            mntList.add(Integer.valueOf(str));
        }

        // 大きい方から順にソート
        Collections.sort(mntList, (x, y) -> y - x);

        // 出力
        for (int i = 0; i < OUT_NUM; i++) {
            System.out.println(mntList.get(i));
        }

        scan.close();
    }
}
