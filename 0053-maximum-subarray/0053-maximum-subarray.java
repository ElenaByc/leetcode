class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
      int largestNum = 0;
      int sum = 0;
      int maxNum = Integer.MIN_VALUE;

      for (Integer num: nums){
            maxNum = Math.max(num, maxNum);
            sum += num;
          
          if (sum < 0)
            sum = 0;

          largestNum = sum > largestNum ? sum : largestNum;
      }
      if (largestNum == 0) return maxNum;

      return largestNum;
    }
}