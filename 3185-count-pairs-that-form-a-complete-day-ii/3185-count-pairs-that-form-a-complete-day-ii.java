class Solution {
    public long countCompleteDayPairs(int[] hs) {
        int n = hs.length;
        long[] rem = new long[24];
        long cnt = 0;
        
        for (int i = 0; i < n; i++) {
            int r = hs[i] % 24;
            rem[r]++;
        }
        
        // System.out.println(Arrays.toString(rem));
        if (rem[0] > 0) {
            cnt += (rem[0]) * (rem[0] - 1) / 2;
        }
        if (rem[12] > 0) {
            cnt += (rem[12]) * (rem[12] - 1) / 2;
        }
        
        for (int i = 1; i < 12; i++) {
            if (rem[i] > 0) {
                cnt += rem[i] * rem[24 - i];
            }
        } 
        
        return cnt;
    }
}