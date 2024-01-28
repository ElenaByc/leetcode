class Solution {
    public int binaryGap(int n) {
        int maxCnt = 0;
        int cnt = 0;
     
        while (n > 0) {
            if (n % 2 == 1) {
                if (cnt > 0) {
                    maxCnt = Math.max(maxCnt, cnt);
                }
                cnt = 1;
            } else {
                if (cnt > 0) {
                    cnt++;
                }
            }
            n /= 2;
        }
        
        return maxCnt;
    }
}