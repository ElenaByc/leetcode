class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length - 1;
        int[] arr = new int[n + 1];
        
        for (int num : nums) {
            if (num <= n) {
                arr[num]++;
            }
        }
        // System.out.println(Arrays.toString(arr));
        for (int i = 1; i < n; i++) {
            if (arr[i] != 1) {
                return false;
            }
        }
        
        if (arr[n] != 2) {
            return false;
        }
        
        return true;
    }
}