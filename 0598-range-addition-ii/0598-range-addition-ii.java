class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minX = m;
        int minY = n;
        
        for (int i = 0; i < ops.length; i++) {
            minX = Math.min(ops[i][0], minX);
            minY = Math.min(ops[i][1], minY);
        }
        
        return minX * minY;
            
    }
}