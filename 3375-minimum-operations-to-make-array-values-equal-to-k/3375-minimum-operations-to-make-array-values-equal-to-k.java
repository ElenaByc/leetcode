class Solution {
    public int minOperations(int[] nums, int k) {
        int cnt = 0;
        int min = 101;
        int[] arr = new int[101];
        for (int n : nums) {
            arr[n]++;
            min = Math.min(min, n);
        }
        if (min < k) {
            return -1;
        }
        for (int i = 100; i > 0; i--) {
            if (arr[i] == 0) continue;
            if (i > k) {
                cnt++;
            }   
        }
        
        return cnt;
    }
}