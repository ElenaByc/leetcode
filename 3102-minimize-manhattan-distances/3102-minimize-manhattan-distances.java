class Solution {
    public int minimumDistance(int[][] ps) {
        int n = ps.length;
        int d = Integer.MAX_VALUE;
        for (int a = -1; a <= +1; a += 2) {
            for (int b = -1; b <= +1; b += 2) {
                for (int m = 0; m <= 1; ++m) {
                    int mx = Integer.MIN_VALUE, my = mx;
                    for (int i = 0; i < n; ++i) {                                        
                      int x = ps[i][m] * a + ps[i][1 - m] * b;
                      int y = ps[i][m] * a - ps[i][1 - m] * b;
                      if (x > mx) {
                          mx = x;
                          my = y;
                      } else if (x == mx) {
                          my = Math.max(my, y);
                      }
                    }
                    int x0 = Integer.MAX_VALUE, y0 = x0;
                    int x1 = Integer.MIN_VALUE, y1 = x1;
                    int z = 0;
                    for (int i = 0; i < n; ++i) {
                       int x = ps[i][m] * a + ps[i][1 - m] * b;
                       int y = ps[i][m] * a - ps[i][1 - m] * b;
                       if (x == mx && y == my && z == 0) {
                           z++;
                       } else {
                           x0 = Math.min(x0, x);
                           x1 = Math.max(x1, x);
                           y0 = Math.min(y0, y);
                           y1 = Math.max(y1, y);
                       }
                    }
                    d = Math.min(d, Math.max(x1 - x0, y1 - y0));
                }
            }
        }
        return d;
    }
}