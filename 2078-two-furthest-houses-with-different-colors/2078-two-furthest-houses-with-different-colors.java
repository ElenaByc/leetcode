class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        
        int maxDistance = 0;
        
        if (colors[0] != colors[n-1]) {
            return n - 1;
        }
        
        for (int i = n - 1; i >= n / 2; i--) {
            if (colors[0] != colors[i]) {
                maxDistance = i;
                break;
            }
        }
        
        for (int i = 1; i <= n / 2; i++) {
            if (colors[i] != colors[n-1]) {
                maxDistance = Math.max(maxDistance, n - 1 - i);
                break;
            }
        }
        
        return maxDistance;
        
    }
}