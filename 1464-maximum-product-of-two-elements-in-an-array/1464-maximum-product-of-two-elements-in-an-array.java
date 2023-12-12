class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n == 2) {
            return (nums[0] - 1) * (nums[1] - 1);
        }
        
        int max1 = 0;
        int max2 = 0;
        int maxIdx = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > max1) {
                max1 = nums[i];
                maxIdx = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != maxIdx && nums[i] > max2) {
                max2 = nums[i];
            }
        }
        
        return (max1 - 1) * (max2 - 1);
    }
}