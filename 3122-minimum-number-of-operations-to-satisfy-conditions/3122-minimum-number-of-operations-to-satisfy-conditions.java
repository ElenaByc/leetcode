class Solution {
    public int minimumOperations(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        //dp[i][j] = minimum cost to turn the i-th column into all j’s
        int[][] dp = new int[n][10];
        for(int i = 0; i < n; i++) {
            int[] cnt = new int[10];
            for(int j = 0; j < m; j++) {
                cnt[grid[j][i]]++;
            }
            for(int j = 0; j < 10; j++) {
                dp[i][j] = m - cnt[j];
            }
        }
        // dpp[i][j] = minimum cost to satisfy condition 
        // for all columns from 0 to i, with the i-th column being all j’s
        int[][] dpp = new int[n][10];
        for(int j = 0; j < 10; j++) { 
            dpp[0][j] = dp[0][j];
        }
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < 10; j++) {
                int min = 1000000;
                for(int k = 0; k < 10; k++) {
                    if(k != j) {
                        min = Math.min(min, dpp[i-1][k]);
                    }
                }
                dpp[i][j] = min + dp[i][j];
            }
        }
        
        int ans = m * n;
        for(int i = 0; i < 10; i++) {
            ans = Math.min(ans, dpp[n-1][i]);
        }
        
        return ans;
    }
}