class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        int totalSum = 0;
        int currSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int i = n - 1;
        while (currSum <= totalSum) {
            result.add(nums[i]);
            currSum += nums[i];
            totalSum -= nums[i];
            i--;
        }
            
        return result;
    }
}