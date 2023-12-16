class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) { // main diagonal
                    if (grid[i][j] == 0) {
                        return false;
                    }
                } else if (j == n - i - 1) { // second diagonal
                    if (grid[i][j] == 0) {
                        return false;
                    }  
                } else {
                    if (grid[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}