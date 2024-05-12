class Solution {
    public int maxScore(List<List<Integer>> grid) {
        int m = grid.size();
        int n = grid.get(0).size();
        int maxScore = Integer.MIN_VALUE;
		int[][] dp = new int[m][n];
        
        for(int i = m - 1; i >= 0; i--){
            for(int j = n - 1; j >= 0; j--){
                dp[i][j] = grid.get(i).get(j);
                if(i < m - 1){
                    dp[i][j] = Math.max(dp[i][j], dp[i + 1][j]);
                }
                if(j < n - 1){
                    dp[i][j] = Math.max(dp[i][j], dp[i][j + 1]);
                }
            }
        }
			for(int i = 0; i < m; i++){
				for(int j = 0; j < n; j++){
					if(i < m - 1){
						maxScore = Math.max(maxScore, dp[i + 1][j] - grid.get(i).get(j));
					}
					if(j < n - 1){
						maxScore = Math.max(maxScore, dp[i][j + 1] - grid.get(i).get(j));
					}
				}
			}
        return maxScore;
    }
}