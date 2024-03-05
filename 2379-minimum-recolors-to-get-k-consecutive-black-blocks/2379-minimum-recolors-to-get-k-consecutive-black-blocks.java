class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int cnt = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
               cnt++; 
            }
        }
        if (k == n) {
            return cnt;
        }
        int min = cnt;

        for (int i = 1; i < n - k + 1; i++) {
            if (blocks.charAt(i - 1) == 'W') {
                cnt--;
            }
            if (blocks.charAt(i + k - 1) == 'W') {
                cnt++;
            }
            min = Math.min(min, cnt);
        }
        return min;
    }
}