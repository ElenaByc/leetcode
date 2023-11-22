class Solution {
    public int findMiddleIndex(int[] nums) {
        int total = 0;
        int sum = 0;
        for (int num : nums) {
            total += num;
        }
        
        for (int i = 0; i < nums.length; i++) {
            total -= nums[i];
            if (sum == total) {
                return i;
            }
            sum += nums[i];
        }
        
        return -1;
    }
}