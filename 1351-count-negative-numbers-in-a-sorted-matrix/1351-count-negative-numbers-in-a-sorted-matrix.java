class Solution {
    public int countNegatives(int[][] matrix) {
        int counter = 0;
        int n = matrix.length;    // number of rows
        int m = matrix[0].length; // number of columns
        
        if (matrix[0][0] < 0) {
            return n * m;
        }
        
        if (matrix[n - 1][m - 1] > 0) {
            return 0;
        }
        int col = 0;
        int row = n - 1;

        while (row >= 0 && col < m) {
            if (matrix[row][col] < 0) {
                counter += m - col;
                row--;
            } else {
                col++;
            }
        }
        return counter;
    }
}