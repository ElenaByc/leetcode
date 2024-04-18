class Solution {
    public int islandPerimeter(int[][] grid) {
        int p = 0;
        int n = grid.length;
        int m = grid[0].length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j] == 1) {
                    p += 4; 
                    // count number of neighbors
                    if (i > 0 && grid[i - 1][j] == 1) {
                        p--;
                    }
                    if (i < n - 1 && grid[i + 1][j] == 1) {
                        p--;
                    }
                    if (j > 0 && grid[i][j - 1] == 1) {
                        p--;
                    }
                    if (j < m - 1 && grid[i][j + 1] == 1) {
                        p--;
                    }
                }
            }
        }
        
        
        return p;
    }
}