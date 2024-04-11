class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int cnt = 0;
        
        for (int n : nums) {
            if ((n & 1) == 0) {
                cnt++;
            }
        }
        
        return cnt >= 2;
    }
}