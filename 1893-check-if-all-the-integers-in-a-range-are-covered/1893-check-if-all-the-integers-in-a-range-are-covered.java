class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] arr = new boolean[right + 1];
        
        for (int[] r : ranges) {
            for (int i = r[0]; i <= Math.min(r[1], right); i++) {
                arr[i] = true;
            }
        }
        
        for (int i = left; i <= right; i++) {
            if (!arr[i]) {
                return false;
            }
        }
        
        return true;
    }
}