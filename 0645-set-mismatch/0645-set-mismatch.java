class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int dup = 0, mis = 0;
        // 2 <= nums.length <= 10000
        // 1 <= nums[i] <= 10000
        for (int num : nums) {
            nums[(num - 1) % 10000] += 10000;
        }
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > 20000) {
               dup = i + 1;
            } 
            if (nums[i] <= 10000) {
                mis = i + 1;
            }
        }
        return new int[] {dup, mis};
    }
}