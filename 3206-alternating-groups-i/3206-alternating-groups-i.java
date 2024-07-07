class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int cnt = 0;
        int n = colors.length;
        
        for (int i = 0; i < n; i++) {
            int prev = i == 0 ? colors[n - 1] : colors[i - 1];
            int curr = colors[i];
            int next = i == n - 1 ? colors[0] : colors[i + 1];
            if (prev == next && prev != curr) {
                cnt++;
            }
        }
        
        return cnt;
    }
}