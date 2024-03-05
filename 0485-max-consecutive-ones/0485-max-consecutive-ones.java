class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cnt = 0;
        for (int num : nums) {
            if (num == 1) {
                cnt++;
            } else {
                if (cnt > 0) {
                    max = Math.max(max, cnt);
                    cnt = 0;
                }
            }
        }
        max = Math.max(max, cnt);
        
        return max;
    }
}