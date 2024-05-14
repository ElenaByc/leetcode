class Solution {
    public int getMaximumGold(int[][] grid) {
        int max = 0;
        int m = grid.length;
        int n = grid[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    // start point
                    max = Math.max(max, helper(i, j, grid));
                }
            }
        }
        
        return max;
    }
    
    public int helper(int i, int j, int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int num = num = grid[i][j];
        grid[i][j] = 0;
        int gold = 0;
        
        if (i > 0 && grid[i - 1][j] > 0) {
            gold = Math.max(helper(i - 1, j, grid), gold);
        }
        
        if (j > 0 && grid[i][j - 1] > 0) {
            gold = Math.max(helper(i, j - 1, grid), gold);
        }      
        
        if (i < m - 1 && grid[i + 1][j] > 0) {
            gold = Math.max(helper(i + 1, j, grid), gold);
        }
        
        if (j < n - 1 && grid[i][j + 1] > 0) {
            gold = Math.max(helper(i, j + 1, grid), gold);
        }
        
        grid[i][j] = num;
        return gold + num;
    }
}