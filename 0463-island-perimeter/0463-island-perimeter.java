class Solution {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int perimeter = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    if ((j > 0 && grid[i][j-1] == 0) || (j == 0)) {
                        perimeter++;
                    }
                    if ((i > 0 && grid[i-1][j] == 0) || (i == 0)) {
                        perimeter++;
                    }
                    if ((j < col - 1 && grid[i][j+1] == 0) || (j == col - 1)) {
                        perimeter++;
                    }
                    if ((i < row - 1 && grid[i+1][j] == 0) || (i == row - 1)) {
                        perimeter++;
                    }
                        
                }
            }
        }
            
            
        return perimeter;
    }
}