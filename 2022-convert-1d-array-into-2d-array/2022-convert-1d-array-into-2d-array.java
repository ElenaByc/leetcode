class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[][] {};
         }
        int[][] result = new int[m][n];
        int idx = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (idx < original.length) {
                    result[i][j] = original[idx];
                    idx++;
                } else {
                    break;
                }
            }
        }
        
        return result;
    }
}