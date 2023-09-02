class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int minTime = 0;
        int[] position = points[0];
        for (int i = 1; i < points.length; i++) {
            minTime += minTimeToVisitPoint(position, points[i]);
            position = points[i];
        }
        return minTime;
    }
    
    public int minTimeToVisitPoint(int[] position, int[] point) {
        int xDif = Math.abs(position[0] - point[0]);
        int yDif = Math.abs(position[1] - point[1]);
        if (position[0] == point[0]) {
            return yDif;
        }
        if (position[1] == point[1]) {
            return xDif;
        }
        if (xDif == yDif) {
            return xDif;
        }
        if (xDif < yDif) {
            return yDif;
        }
        return xDif;
    }
}