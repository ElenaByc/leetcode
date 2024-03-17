class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int dest) {
        int d1 = 0;
        int total = 0;
        if (start == dest) return 0;
        if (start > dest) {
            int temp = dest;
            dest = start;
            start = temp;
        }

        for (int d : distance) {
            total += d;
        }
            
        for (int i = start; i < dest; i++) {
            d1 += distance[i];
        }
        
        
        
        return Math.min(d1, total - d1);
    }
}