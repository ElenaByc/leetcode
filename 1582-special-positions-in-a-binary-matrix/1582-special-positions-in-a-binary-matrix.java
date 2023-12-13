class Solution {
    public int numSpecial(int[][] mat) {
        int cnt = 0;
        int m = mat.length;
        int n = mat[0].length;
        int[] rowCount = new int[m];
        int[] colCount = new int[n];
        
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (mat[row][col] == 1) {
                    rowCount[row]++;
                    colCount[col]++;
                }
            }
        }

        for(int row = 0; row < m; row++) {    
            if( rowCount[row] == 1) {
                for(int col = 0; col < n; col++) {
                    if(colCount[col] == 1 && mat[row][col] == 1) {
                        cnt++;
                        break;    // There is no point looking any further, you just found the only possible 1.
                    }
                }
            }
        }
        
        return cnt;
    }
}