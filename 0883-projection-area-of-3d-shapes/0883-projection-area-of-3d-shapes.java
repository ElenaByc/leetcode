class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int maxInColumn;
        int maxInRow;
        int area = 0;
        
        for (int i = 0; i < n; i++) {
            maxInColumn = 0;
            maxInRow = 0;
            for (int j = 0; j < n; j++) {
                maxInColumn = Math.max(maxInColumn, grid[j][i]);
                maxInRow = Math.max(maxInRow, grid[i][j]);
                if (grid[i][j] != 0) {
                    area++;
                }
            }
            area += maxInRow;
            area += maxInColumn; 
        }

        return area;
    }
}