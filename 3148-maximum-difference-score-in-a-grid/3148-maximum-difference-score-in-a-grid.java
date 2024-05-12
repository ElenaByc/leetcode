class Solution {
    public int maxScore(List<List<Integer>> grid) {
        int m = grid.size();
        int n = grid.get(0).size();
        int[][] dp = new int[m][n];
        int maxScore = Integer.MIN_VALUE;
		
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = grid.get(i).get(j);
                int min = Math.min(
                    i > 0 ? dp[i - 1][j] : 1000000,
                    j > 0 ? dp[i][j - 1] : 1000000
                );
                maxScore = Math.max(maxScore, dp[i][j] - min);
                dp[i][j] = Math.min(dp[i][j], min);
            }
        }
    
        return maxScore;
    }
}