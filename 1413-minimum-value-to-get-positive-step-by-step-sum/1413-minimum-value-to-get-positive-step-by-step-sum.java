class Solution {
    public int minStartValue(int[] nums) {
        int minPrefixSum = nums[0];
        int sum = 0;
        
        for (int num : nums) {
            sum += num;
            if (sum < minPrefixSum) {
                minPrefixSum = sum;
            }
        }
        
        if (minPrefixSum >= 0) {
            return 1;
        }
        
        return -minPrefixSum + 1;
    }
}