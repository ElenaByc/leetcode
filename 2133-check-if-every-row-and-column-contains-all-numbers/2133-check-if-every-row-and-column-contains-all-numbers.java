class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        var set = new int[n];
        
        // row
        for (int[] row : matrix) {
            Arrays.fill(set, 0);
            for (int i : row) {
                if (set[i-1] > 0) {
                    return false;
                }
                set[i-1]++;
            }
        }
        
        // column 
        for (int c = 0; c < n; c++) {
             Arrays.fill(set, 0);
            for (int r = 0; r < n; r++) {
                if (set[matrix[r][c] - 1] > 0) {
                    return false;
                }
                set[matrix[r][c] - 1]++;
            }
        }
        
        return true;
    }
}