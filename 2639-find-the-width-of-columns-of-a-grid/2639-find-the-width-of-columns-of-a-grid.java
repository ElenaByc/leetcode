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
                len = Integer.toString(grid[i][j]).length();
                if (len > width) {
                    width = len;
                }
            }
            widths[j] = width;
        }
        
        
        return widths;
    }
}