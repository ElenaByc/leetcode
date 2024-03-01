class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] arr = new int[1000]; // because 1 <= nums[i] <= 1000
        int n = nums.length;
        int max = 0;
        int target = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == key && i < n - 1) {
                arr[nums[i+1] - 1]++;
                if (max < arr[nums[i+1] - 1]) {
                    max = arr[nums[i+1] - 1];
                    target = nums[i+1];
                }
            }
        }
        
        return target;
    }
}