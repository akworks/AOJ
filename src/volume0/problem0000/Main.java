package src.volume0.problem0000;

public class Main {

    private static final int MAX = 9;

    public static void main(String[] args) {
        for (int i = 1; i <= MAX; i++) {
            for (int j = 1; j <= MAX; j++) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("x");
                sb.append(j);
                sb.append("=");
                sb.append(i * j);
                System.out.println(sb.toString());
            }
        }
    }
}
