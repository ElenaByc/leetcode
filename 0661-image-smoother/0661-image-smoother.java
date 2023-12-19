class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] result  = new int[m][n];
        int sum;
        int cnt;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum = 0;
                cnt = 0;
                // current row
                if (j > 0) {
                    sum += img[i][j - 1];
                    cnt++;
                }
                sum += img[i][j];
                cnt++;
                if (j < n - 1) {
                    sum += img[i][j + 1];
                    cnt++;
                }
                // prev row
                if (i > 0) {
                    if (j > 0) {
                        sum += img[i - 1][j - 1];
                        cnt++;
                    }
                    sum += img[i - 1][j];
                    cnt++;
                    if (j < n - 1) {
                        sum += img[i - 1][j + 1];
                        cnt++;
                    }
                }
                // next row
                if (i < m - 1) {
                    if (j > 0) {
                        sum += img[i + 1][j - 1];
                        cnt++;
                    }
                    sum += img[i + 1][j];
                    cnt++;
                    if (j < n - 1) {
                        sum += img[i + 1][j + 1];
                        cnt++;
                    }
                }
                result[i][j] = sum / cnt;
            }
        }
        
        return result;
    }
}