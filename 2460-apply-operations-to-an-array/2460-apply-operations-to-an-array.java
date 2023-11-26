class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }
        
        int i = 0;
        for (int num : nums) {
            if (num != 0) {
                result[i] = num;
                i++;
            }
        }
        
        return result;
        
    }
}