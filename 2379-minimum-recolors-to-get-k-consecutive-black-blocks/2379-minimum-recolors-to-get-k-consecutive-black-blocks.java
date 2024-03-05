class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int min = k;
        int cnt;
        for (int i = 0; i < n - k + 1; i++) {
            cnt = 0;
            for (int j = i; j < i + k; j++) {
                if (blocks.charAt(j) == 'W') {
                   cnt++; 
                }
            }
            min = Math.min(min, cnt);
        }
        return min;
    }
}