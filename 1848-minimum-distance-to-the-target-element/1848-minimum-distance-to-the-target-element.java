class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        if (nums[start] == target) return 0;
        
        int left = start;
        int right = start;
        int n = nums.length;
        
        while (left >= 0 && nums[left] != target) {
            left--;
        }
        
        while (right < n && nums[right] != target) {
            right++;
        }

        if (left < 0) return right - start;
        if (right == n) return start - left;
        return Math.min(start - left, right - start);
    }
}