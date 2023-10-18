class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] result = new int[n];
        
        for (int i = 0; i  < n; i++) {
            result[i] = nextGreater(nums1[i], nums2);
        }
        
        return result;
    }
    
    public int nextGreater(int num, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] > num) {
                        return nums[j];
                    }
                }
                return -1;
            }
        }
        return -1;
    }
}