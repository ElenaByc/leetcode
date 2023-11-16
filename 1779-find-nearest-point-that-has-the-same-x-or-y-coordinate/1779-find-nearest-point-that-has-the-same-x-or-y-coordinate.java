class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1;
        int minDistance = Integer.MAX_VALUE;
        int a;
        int b;
        int distance;
        
        for (int i = 0; i < points.length; i++) {
            a = points[i][0];
            b = points[i][1];
            if (a == x || b == y) {
                distance = Math.abs(x - a) + Math.abs(y - b);
                if (distance < minDistance) {
                    minDistance = distance;
                    index = i;
                }
            }
        }
        
        return index;
    }
}