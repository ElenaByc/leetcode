class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int h1 = 0;
        int h2 = 0;
        int r = red;
        int b = blue;
        
        while (red > 0 || blue > 0) {
            if (red >= h1 + 1) {
                red -= (h1 + 1);
                h1++;
                if (blue >= h1 + 1) {
                    blue -= (h1 + 1);
                    h1++;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        // System.out.println("h1 = " + h1 + "r = " + red + "b = " + blue);
        while (r > 0 || b > 0) {
            if (b >= h2 + 1) {
                b -= (h2 + 1);
                h2++;
                if (r >= h2 + 1) {
                    r -= (h2 + 1);
                    h2++;
                } else {
                    break;
                }
            } else {
                break;
            } 
        }
         // System.out.println("h2 = " + h2 + "r = " + r + "b = " + b);
        return Math.max(h1, h2);
    }
}