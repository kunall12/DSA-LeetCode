class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= n; i++) {
            int coin = coins[i - 1]; 
            for (int t = 0; t <= amount; t++) {
                dp[i][t] = dp[i - 1][t];
                if (t >= coin) {
                    dp[i][t] += dp[i][t - coin];
                }
            }
        }

        return dp[n][amount]; 
    }
}