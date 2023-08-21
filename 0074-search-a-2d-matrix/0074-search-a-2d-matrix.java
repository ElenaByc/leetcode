class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     //binary search
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0;
        int high = m * n - 1;
        int mid;
        int i, j;
        while (low <= high) {
            mid = low + (high - low) / 2;
            // calculate i and j
            i = mid / m;
            j = mid % m;
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}