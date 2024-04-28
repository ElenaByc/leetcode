class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean covered;
        for(int i = left; i <= right; i++){
            covered = false;
            for(int[] r : ranges) {
                if ( i >= r[0] && i <= r[1]) {
                    covered = true;
                    break;
                }
            }
            if (!covered) return false;
        }
        return true;
    }
}