class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int temp;
        
        while (left < right) {
            while (left <= right && nums[left] % 2 == 0) {
                left++;
            }
            while (right >= left && nums[right] % 2 != 0) {
                right--;
            }
            if (left < right) {
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        
        return nums;
    }
}