class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        while (i < n && nums[i] == 0) {
            i++;
        }
        if (i == n) {
            return true; // no 1s
        }

        int j = i + 1;
        while (j < n) {
            while(j < n && nums[j] == 0) {
                j++;
            }
            if (j == n) {
                return true;
            }
            if (j - i - 1 < k) {
                return false;
            } 
            i = j;
            j++;
        }

        return true;
    }
}