class Solution {
    public int minOperations(int[] nums, int k) {
        int cnt = 0;
        for (int n : nums) {
            if (n < k) {
                cnt++;
            }
        }
        
        return cnt;
    }
}