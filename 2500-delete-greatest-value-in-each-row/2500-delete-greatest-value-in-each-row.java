class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length; // num of rows
        int n = grid[0].length;
        int result = 0;
        

        for (int[] row : grid) {
            Arrays.sort(row);
        }

        int colMax;
        for (int i = 0; i < n; i++) {
            colMax = 0;
            for (int j = 0; j < m; j++) {
                colMax = Math.max(colMax, grid[j][i]);
            }
            result += colMax;
        }
        
        return result;
        
    }
}