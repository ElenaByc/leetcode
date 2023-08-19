class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return true;
        }
        int i = 1;
        while (i < n && nums[i] == nums[0]) {
            i++;
        }
        if (i == n) return true;
        // System.out.println(i);
        boolean decreases = nums[0] > nums[i];
        for (; i < n; i++) {
            if (decreases) {
                if (nums[i] > nums[i - 1]) {
                    return false;
                }
            } else if (nums[i] < nums[i - 1]) {
                    return false;
            }
        }
        return true;
    }
}