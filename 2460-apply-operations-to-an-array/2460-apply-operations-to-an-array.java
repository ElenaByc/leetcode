class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }
        
        int p1 = 0;
        int p2 = 0;
        while (p2 < n) {
            while (p2 < n && nums[p2] == 0) {
                p2++;
            }
            if (p2 < n) {
                nums[p1] = nums[p2];
                p1++;
                p2++;
            }
        }
        while (p1 < n) {
            nums[p1] = 0;
            p1++;
        }

        return nums;
    }
}