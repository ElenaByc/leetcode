class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int n = matrix.length; // number of rows
        int m = matrix[0].length; // number of columns
        
        int[] columnsMax = new int[m];
        
        for (int i = 0; i < m; i ++) {
            columnsMax[i] = 0;
            for (int j = 0; j < n; j ++) {
                 if (matrix[j][i] >  columnsMax[i]) {
                      columnsMax[i] = matrix[j][i];
                 }
            }
        }
        
        int minInRow;
        int minInRowIdx;
        for (int i = 0; i < n; i ++) {
            minInRow = 100001;
            minInRowIdx = -1;
            for (int j = 0; j < m; j ++) {
                if (matrix[i][j] <  minInRow) {
                    minInRow = matrix[i][j];
                    minInRowIdx = j;
                }
            }
            if (minInRow == columnsMax[minInRowIdx]) {
                result.add(minInRow);
            } 
        }
        
        return result;
    }
}