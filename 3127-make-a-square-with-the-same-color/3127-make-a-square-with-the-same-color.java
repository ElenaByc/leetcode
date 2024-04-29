class Solution {
    public boolean canMakeSquare(char[][] grid) {
        // check all 2 x 2 squares
        int cntB, cntW;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                cntB = 0;
                cntW = 0;
                if (grid[i][j] == 'W') {
                    cntW++;
                } else {
                    cntB++;
                }
                if (grid[i + 1][j] == 'W') {
                    cntW++;
                } else {
                    cntB++;
                }
                if (grid[i][j + 1] == 'W') {
                    cntW++;
                } else {
                    cntB++;
                }
                
                if (grid[i + 1][j + 1] == 'W') {
                    cntW++;
                } else {
                    cntB++;
                }
                if (cntB >= 3 || cntW >= 3) {
                    return true;
                } 
            }
        }
        
        return false;
    }
}