class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] nums = new int [1001];
        
        for (int n : target) {
            nums[n]++;
        }
        
        for (int n : arr) {
            nums[n]--;
            if(nums[n] < 0) {
                return false;
            }
        }
        
        for (int n : nums) {
            if (nums[n] != 0) {
                return false;
            }
        }
        
        return true;
    }
}