class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix[0].length;
        int temp;
        // first flip
        for(int i = 0; i < n/2; i++){
          int[] temp1 = matrix[i];
          matrix[i] = matrix[n - 1 - i];
          matrix[n-1-i] = temp1;
        }

        // second flip
        for (int row = 0; row < n; row++) {
            for (int col = row + 1; col < n; col++) {
                temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
    }
}