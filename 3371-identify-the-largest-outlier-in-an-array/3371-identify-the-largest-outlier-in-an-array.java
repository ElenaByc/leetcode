class Solution {
    public int getLargestOutlier(int[] nums) {
        int[] cnt = new int[2001];
        int total = 0;
        
        for (int num : nums) {
            total += num;
            cnt[num + 1000]++;
        }
        
        int sum;
        for (int i = 2000; i >= 0; i--) {
            if (cnt[i] == 0) {
                continue;
            }
            int num = i - 1000;
            sum = total - num;
            if (sum % 2 != 0) {
                continue;
            }
            sum /= 2;
            if (sum < -1000 || sum > 1000) {
                continue;
            }
            if ((sum != num && cnt[sum + 1000] > 0) || (sum == num && cnt[sum + 1000] > 1)) {
                return num;
            }
        }
        
        return 0;
    }
}