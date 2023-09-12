class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int rectNum = 0;
        int maxLen = 0;
        int minSide;
        for (int i = 0; i < rectangles.length; i++) {
            minSide = Math.min(rectangles[i][0], rectangles[i][1]);
            if (minSide > maxLen) {
                maxLen = minSide;
                rectNum = 1;
            } else if (minSide == maxLen) {
                rectNum++;
            }
        }
        
        return rectNum;
    }
}