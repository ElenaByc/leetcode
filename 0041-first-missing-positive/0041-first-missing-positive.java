class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct_index = nums[i] - 1;
            if (i != correct_index  && nums[i] > 0 
                && nums[i] <= nums.length 
                && nums[i] != nums[correct_index]) {
                swap(nums, i, correct_index);
            } else {
                i++;
            }
        }
        for (i = 0; i < nums.length; i++) {
            int correct_index = nums[i] - 1;
            if (i != correct_index) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }

    void swap(int nums[], int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}