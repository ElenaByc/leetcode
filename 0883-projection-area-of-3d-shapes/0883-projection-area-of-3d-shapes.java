class Solution {
    public int projectionArea(int[][] grid) {
        // s1(bottom) = number of non zero elements in grid
        // s2 - sum of max row
        // s3 - max of max column
        int n = grid.length;
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        int maxInColumn;
        int maxInRow;
        
        for (int i = 0; i < n; i++) {
            maxInColumn = 0;
            maxInRow = 0;
            for (int j = 0; j < n; j++) {
                maxInColumn = Math.max(maxInColumn, grid[j][i]);
                maxInRow = Math.max(maxInRow, grid[i][j]);
                if (grid[i][j] != 0) {
                    s1++;
                }
            }
            s2 += maxInRow;
            s3 += maxInColumn; 
        }

        return s1 + s2 + s3;
    }
}