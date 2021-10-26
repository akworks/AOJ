package src.volume0.problem0000;

/**
 * Problem Set from Volume0
 * Problem Title : 0000:   QQ
 */
public class Main {

    private static final int MAX = 9;

    public static void main(String[] args) {
        for (int i = 1; i <= MAX; i++) {
            for (int j = 1; j <= MAX; j++) {

                // 九九の式を示す文字列の作成
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("x");
                sb.append(j);
                sb.append("=");
                sb.append(i * j);

                // 1行出力
                System.out.println(sb.toString());
            }
        }
    }
}
