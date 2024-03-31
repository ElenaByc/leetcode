class Solution {
    public int alternatingSubarray(int[] nums) {
        int n = nums.length;
        int maxLen = -1;
        int len;
        int i = 0;
        while (i + 1 < n && nums[i] + 1 != nums[i+1]) {
            i++;
        }
        if (i + 1 == n) {
            return -1;
        }
        int n1 = nums[i];
        int n2 = nums[i + 1];
        i += 2;
        len = 2;
        while (i < n) {
            if (nums[i] == n1) {
                len++;
                n1 = n2;
                n2 = nums[i];
            } else {
                maxLen = Math.max(maxLen, len);
                i--;
                while (i + 1 < n && nums[i] + 1 != nums[i+1]) {
                    i++;
                }
                if (i + 1 < n) {
                    n1 = nums[i];
                    n2 = nums[i + 1];
                    len = 2;
                    i++;
                } 
            }
            i++;
        }
        
        return Math.max(maxLen, len);
    }
}