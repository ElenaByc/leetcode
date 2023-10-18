class Solution {
    public int projectionArea(int[][] grid) {
        // s1(bottom) = number of non zero elements in grid
        // s2 - sum of max row
        // s3 - max of max column
        int n = grid.length;
        int maxInRow;
        int s2 = 0;
        int s1 = 0;
        for (int[] row : grid) {
            maxInRow = 0;
            for (int num : row) {
                maxInRow = Math.max(maxInRow, num);
                if (num != 0) {
                    s1++;
                }
            }
            s2 += maxInRow;
        }
        
        int s3 = 0;
        int maxInColumn;
        for (int i = 0; i < n; i++) {
            maxInColumn = 0;
            for (int j = 0; j < n; j++) {
                maxInColumn = Math.max(maxInColumn, grid[j][i]);
            }
            s3 += maxInColumn;
        }
        
        
        
        return s1 + s2 + s3;
    }
}