class Solution {
    public int maxRectangleArea(int[][] points) {
        int n = points.length;
        int max = -1;
        
        for (int i0 = 0; i0 < n; i0++) {
            int x0 = points[i0][0], y0 = points[i0][1];
            for (int i1 = 0; i1 < n; i1++) {
                int x1 = points[i1][0], y1 = points[i1][1];
                if (x1 != x0 || y1 <= y0) continue;
                for (int i2 = 0; i2 < n; i2++) {
                    int x2 = points[i2][0], y2 = points[i2][1];
                    if (y2 != y0 || x2 <= x0) continue;
                    for (int i3 = 0; i3 < n; i3++) {
                        int x3 = points[i3][0], y3 = points[i3][1];
                        if (y3 != y1 || x3 != x2) continue;
                        int k = 0;
                        for (int j = 0; j < n; j++) {
                             int x = points[j][0], y = points[j][1];
                            if( x0 <= x && x <= x2 && y0 <= y && y <= y1) ++k;
                        }
                        if (k == 4) {
                            max = Math.max(max, (x2 - x0) * (y1 - y0));
                        }
                    }
                }
            }
        }
        
        return max;
    }
}