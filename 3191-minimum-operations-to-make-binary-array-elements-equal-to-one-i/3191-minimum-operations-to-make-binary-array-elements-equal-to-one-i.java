class Solution {
    public int minOperations(int[] nums) {
        int i = 0;
        int cnt = 0;
        int n = nums.length;
        
        while (i < n) {
            while (i < n && nums[i] == 1) {
                i++;
            }
            if (i < n) {
                if (i < n - 2) {
                    nums[i + 1] = 1 - nums[i + 1];
                    nums[i + 2] = 1 - nums[i + 2];
                    cnt++;
                    i++;
                } else {
                    return -1;
                }
            }
        }
        
        return cnt;
    }
}