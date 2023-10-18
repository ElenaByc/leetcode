class Solution {
    public int minimumOperations(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        Arrays.sort(nums); // O(n log n)
        
        int lastIdx = 0;
        while (lastIdx < n && nums[lastIdx] == 0) {
            lastIdx++;
        }
        while (lastIdx < n) {
            for (int i = lastIdx + 1; i < n; i++) {
                nums[i] -= nums[lastIdx];
            }
            nums[lastIdx] = 0;
            cnt++;
            while (lastIdx < n && nums[lastIdx] == 0) {
                lastIdx++;
            }
        }
        
        return cnt;
    }
}