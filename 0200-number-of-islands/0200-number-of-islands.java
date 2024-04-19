class Solution {
    public int numIslands(char[][] grid) {
        int cnt = 0;
        int n = grid.length;
        int m = grid[0].length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    // mark all connected '1'
                    dfs(grid, i, j);
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
    
    public void dfs(char[][] grid, int i, int j) {
        int n = grid.length;
        int m = grid[0].length;
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') {
            return;
        }
        // mark visited - '#'
        grid[i][j] = '#';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}