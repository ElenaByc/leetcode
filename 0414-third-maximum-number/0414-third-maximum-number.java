class Solution {
    public int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        boolean max2found = false;
        boolean max3found = false;
        
        for (int num : nums) {
            max = Math.max(max, num);
        }
        
        for (int num : nums) {
            if (num >= max2 && num != max) {
                max2 = num;
                max2found = true;
            }
        }
        
        for (int num : nums) {
            if (num >= max3 && num != max & num != max2) {
                max3 = num;
                max3found = true;
                
            }
        }
        
        return max3found ? max3 : max;
    }
}