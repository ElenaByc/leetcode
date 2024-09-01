class Solution {
    public int[][] construct2DArray(int[] o, int m, int n) {
        if (m * n != o.length) {
            return new int[][] {};
        }
        
        int[][] res = new int[m][n];
        
        int idx = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = o[idx++];
            }
        }
        
        return res;
    }
}