class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int n = nums.length;
        if (n == 2) {
            return true;
        }
        int i = 1;
        int prev;
        while (i < n && nums[i] > nums[i - 1]) {
            i++;
        }
        if (i == n) return true;
        if (nums[i] == nums[i - 1]) {
            for (int j = i; j < n; j++) {
                if (nums[j] <= nums[j - 1]) {
                    return false;
                }
            }
            return true;
        }
        // remove i - 1
        boolean valid = true;
        // System.out.println(nums[i-1] + " " + nums[i]);
        if (i - 1 == 0) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] <= nums[j - 1]) {
                    valid = false;
                    break;
                }
            }
        } else {
            prev = nums[i - 2];
            // System.out.println("prev = " + prev);
            for (int j = i; j < n; j++) {
                if (nums[j] <= prev) {
                    valid = false;
                    break;
                }
                prev = nums[j];
            }
        }
        if (valid) return true;
        // remove i
        prev = nums[i - 1];
        // System.out.println("prev = " + prev);
        for (int j = i + 1; j < n; j++) {
            if (nums[j] <= prev) {
                return false;
            }
            prev = nums[j];
        }
        
        return true;
    }
}