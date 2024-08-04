class neighborSum {
    int[] arrA;
    int[] arrD;
    
    public neighborSum(int[][] grid) {
        int n = grid.length;
        arrA = new int[n * n];
        arrD = new int[n * n];
        int a, d;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                a = 0;
                d = 0;
                if (i > 0) {
                    a += grid[i - 1][j];
                    if (j > 0) {
                        d += grid[i - 1][j - 1];
                    }
                    if (j < n - 1) {
                        d += grid[i - 1][j + 1];
                    }
                }
                if (i < n - 1) {
                    a += grid[i + 1][j];
                    if (j > 0) {
                        d += grid[i + 1][j - 1];
                    }
                    if (j < n - 1) {
                        d += grid[i + 1][j + 1];
                    }
                }
                if (j > 0) {
                    a += grid[i][j - 1];
                }
                if (j < n - 1) {
                    a += grid[i][j + 1];
                }
                arrA[val] = a;
                arrD[val] = d;
            }
        }
    }
    
    public int adjacentSum(int val) {
        return arrA[val];        
    }
    
    public int diagonalSum(int val) {
        return arrD[val];
    }

}

/**
 * Your neighborSum object will be instantiated and called as such:
 * neighborSum obj = new neighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */