class Solution {

    public int minSteps(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 1000);

        // Base case
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i / 2; j++) {
                // Copy All and Paste (i-j) / j times
                // for all valid j's
                if (i % j == 0) {
                    dp[i] = Math.min(dp[i], dp[j] + i / j);
                }
            }
        }

        return dp[n];
    }
}