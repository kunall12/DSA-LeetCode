class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int INF = Integer.MAX_VALUE/2;

        int[][] dp = new int[n + 1][amount + 1];

        for (int t = 1; t <= amount; t++) {
            dp[0][t] = INF;
        }
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i <= n; i++) {
            int coin = coins[i - 1];

            for (int t = 1; t <= amount; t++) {
                dp[i][t] = dp[i - 1][t];
                if (t >= coin) {
                    dp[i][t] = Math.min(dp[i][t], 1 + dp[i][t - coin]);
                }
            }
        }

        return dp[n][amount] >= INF ? -1 : dp[n][amount];
    }
}