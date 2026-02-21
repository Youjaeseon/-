import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine().trim());

        // dp[k][n] : k층 n호 사람 수 (k:0~14, n:0~14)
        int[][] dp = new int[15][15];

        // 0층 초기화: 0층 i호에는 i명
        for (int i = 1; i <= 14; i++) {
            dp[0][i] = i;
        }

        // DP 채우기
        for (int k = 1; k <= 14; k++) {
            for (int n = 1; n <= 14; n++) {
                dp[k][n] = dp[k][n - 1] + dp[k - 1][n];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < T; tc++) {
            int k = Integer.parseInt(br.readLine().trim());
            int n = Integer.parseInt(br.readLine().trim());
            sb.append(dp[k][n]).append('\n');
        }

        System.out.print(sb.toString());
    }
}