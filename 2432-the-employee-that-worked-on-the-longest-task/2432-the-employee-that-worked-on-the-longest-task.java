class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int maxTime = 0;
        int prev = 0;
        int curr;
        int id = 501;
        
        for (int[] pair : logs) {
            curr = pair[1] - prev;
            if (curr > maxTime) {
                maxTime = curr;
                id = pair[0];
            } else if (curr == maxTime) {
                if (id > pair[0]) {
                    id = pair[0];
                }
            }
            prev = pair[1];
        }
        
        return id;
    }
}