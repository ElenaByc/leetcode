class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;    // number of rows
        int n = mat[0].length; // number of columns
        int[] res = new int[k];
        /*
		 * we can create a score to match the sort condition from description
		 * score = soldiersCount * rows + currentRowIndex
		 * so we can get soldiersCount by score / rows, and get rowIndex by score % rows
		 */
        int[] score = new int[m];
        int j;
        for (int i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    break;
                }
            }
            score[i] = j * m + i;
        }
        // System.out.println(Arrays.toString(score));
        Arrays.sort(score);
        // System.out.println(Arrays.toString(score));
        for (int i = 0; i < k; i++) {
            // get row Index
            res[i] = score[i] % m;
        }
        
        return res;
    }
}