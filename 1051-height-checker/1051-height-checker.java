class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] sorted = new int[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = heights[i];
        }
        Arrays.sort(sorted);
        
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (sorted[i] != heights[i]) {
                cnt++;
            }
        }
        
        return cnt;
    }
}