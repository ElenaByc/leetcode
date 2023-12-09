class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int[] widths = new int[n];
        int width;
        int len;
        
        for (int j = 0; j < n; j++) {
            width = 0;
            for (int i = 0; i < m; i++) {
                // len = Integer.toString(grid[i][j]).length();
                len = calcLength(grid[i][j]);
                if (len > width) {
                    width = len;
                }
            }
            widths[j] = width;
        }
        
        return widths;
    }
    
    public int calcLength (int num) {
        if (num == 0) return 1;
        int len = 0;
        if (num < 0) {
            len++;
            num = - num;
        }
        
        while (num > 0) {
            len++;
            num /= 10;
        }
        
        return len;
    }
}