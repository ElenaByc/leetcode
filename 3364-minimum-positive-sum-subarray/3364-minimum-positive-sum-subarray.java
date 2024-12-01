class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;
        boolean found = false;
        
        int sum = 0;
        int n = nums.size();
        
        for (int len = l;  len <= r; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                sum = 0;
                for (int j = 0; j < len; j++) {
                    sum += nums.get(i + j);
                }
                if (sum > 0 && sum < min) {
                    min = sum;
                    found = true;
                }
            }
        }
    
        return found ? min : -1;
    }
}