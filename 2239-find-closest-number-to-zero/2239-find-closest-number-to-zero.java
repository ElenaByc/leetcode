class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];
        int len = Math.abs(nums[0]);
        int l;
        
        for (int n : nums) {
            l = Math.abs(n);
            if (l < len) {
                len = l;
                closest = n;
            } if (l == len) {
                if (n > closest) {
                    closest = n;
                }
            }
        }
        
        return closest;
    }
}