package beginner;

import java.util.Scanner;

public class TileFix {
    private static final int MOD = 796796;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        System.out.println(countTilingWays(N));
    }

    public static int countTilingWays(int N) {
        if (N == 1) {
            return 1;
        } else if (N == 2) {
            return 2;
        }

        int[] dp = new int[N + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= N; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }

        return dp[N];
    }
}
