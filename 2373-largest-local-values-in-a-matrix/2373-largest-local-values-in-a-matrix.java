class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n  = grid.length;
        int[][] result = new int[n-2][n-2];
        int max;
        
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                max = 0;
                for (int k = 0; k < 3; k++) {
                    for (int m = 0; m < 3; m++) {
                        max = Math.max(max, grid[i + k][j + m]);
                    }
                }
                result[i][j] = max;
            }
            
        }
        
        return result;
    }
}