class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        int n = nums.length - 2;
        int[] nums2 = new int[n];
        int i = 0;
        
        for (int num : nums) {
            nums2[num]++;
            if (nums2[num] > 1) {
                ans[i] = num;
                i++;
            }
        }
        
        // System.out.println(Arrays.toString(nums2));
        
        return ans;    
    }
}