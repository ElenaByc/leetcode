class Solution {
    public long pickGifts(int[] gifts, int k) {
        int max;
        int maxIdx;
        int n = gifts.length;
        
        for (int i = 0; i < k; i++) {
            max = 0;
            maxIdx = -1;
            for (int j = 0; j < n; j++) {
                if (gifts[j] > max) {
                    max = gifts[j];
                    maxIdx = j;
                }
            }
            gifts[maxIdx] = (int)Math.sqrt(max);
        }
        
        long sum = 0;
        for (int g : gifts) {
            sum += g;
        }
        
        return sum;
    }
}