class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int first = 0;
        int last = nums.length - 1;
        
        long sum = 0;
        
        while (first < last) {
            sum += Long.parseLong(Integer.toString(nums[first]) + Integer.toString(nums[last]));
            first++;
            last--;
        }
        
        if (first == last) {
            sum += nums[first];
        }
        
        return sum;
    }
}