class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        low = binarySearch(nums, low, high, original);
        
        while (low != -1) {
            original *= 2;
            low = binarySearch(nums, low, high, original);
        }
        
        return original;
    }
    
    public int binarySearch(int[] nums, int low, int high, int target) {
        int mid;
        while (low <= high) {
            mid = low + (high - low) /2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
        
    }
}