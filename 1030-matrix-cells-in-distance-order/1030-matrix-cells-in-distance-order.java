class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] result = new int [rows * cols][2];
        result[0]  = new int[] {rCenter, cCenter};
        int i = 1;
        int d = 1;
        int x, y;
        while (i < rows * cols) {
            if (rCenter - d >= 0) {
                result[i] = new int[] {rCenter - d, cCenter};
                i++;
            }
            if (rCenter + d < rows) {
                result[i] = new int[] {rCenter + d, cCenter};
                i++;
            }
            if (cCenter - d >= 0) {
                result[i] = new int[] {rCenter, cCenter - d};
                i++;
            }
            if (cCenter + d < cols) {
                result[i] = new int[] {rCenter, cCenter + d};
                i++;
            }
            for (x = 1; x < d; x++) {
                y = d - x;
                if (rCenter - x >= 0 && cCenter - y >= 0) {
                    result[i] = new int[] {rCenter - x, cCenter - y};
                    i++;
                }
                if (rCenter + x < rows && cCenter - y >= 0) {
                    result[i] = new int[] {rCenter + x, cCenter - y};
                    i++;
                }
                if (rCenter - x >= 0 && cCenter + y < cols) {
                    result[i] = new int[] {rCenter - x, cCenter + y};
                    i++;
                }
                if (rCenter + x < rows && cCenter + y < cols) {
                    result[i] = new int[] {rCenter + x, cCenter + y};
                    i++;
                }
            }
            d++;
        }
        return result;
    }
}