class Solution {
    public boolean isPossible(int[] dist, int speed, double hour) {
        double ans = 0;
        for (int i = 0; i < dist.length; i++) {
            double d = dist[i] * 1.0 / speed;
            if (i != dist.length - 1)
                ans += Math.ceil(d);
            else
                ans += d;
            if (ans > hour)
                return false;
        }
        return ans <= hour;
    }

    public int minSpeedOnTime(int[] dist, double hour) {
        // binary search
        int low = 1;
        int high = (int) 1e7; // max possible speed
        int minSpeed = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(dist, mid, hour)) {
                minSpeed = mid;
                high = mid - 1;
            } else { // need to test higher speed
                low = mid + 1;
            }
        }
        return minSpeed;
    }
}
