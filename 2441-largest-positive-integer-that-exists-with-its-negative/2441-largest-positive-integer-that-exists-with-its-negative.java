class Solution {
    public int findMaxK(int[] nums) {
        int[] arr = new int [2001];
        int max = -1;
        
        for (int n : nums) {
            if (n > 0) {
                arr[n]++;
            } else {
                arr[1000 - n]++;
            }
        }
        
        for (int n : nums) {
            if (n > max && arr[1000 + n] > 0) {
                max = n;
            }
        }
             
        return max;
    }
}