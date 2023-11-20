class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int n = garbage.length;
        int travelTime = 0;
        int pickingTime = 0;
        int maxGIndex = -1;
        int maxPIndex = -1;
        int maxMIndex = -1;
        
        for (int i = 0; i < n; i++) {
            pickingTime += garbage[i].length();
            if (garbage[i].indexOf('G') != -1) {
                maxGIndex = i;
            }
            if (garbage[i].indexOf('M') != -1) {
                maxMIndex = i;
            }
            if (garbage[i].indexOf('P') != -1) {
                maxPIndex = i;
            }
        }
        
        for (int i = 1; i < n; i++) {
            if (i <= maxGIndex) {
                travelTime += travel[i - 1];
            }
            if (i <= maxMIndex) {
                travelTime += travel[i - 1];
            }
            if (i <= maxPIndex) {
                travelTime += travel[i - 1];
            }
            if (i >= Math.max(Math.max(maxGIndex, maxPIndex), maxMIndex)) {
                break;
            }
        }
        
        return travelTime + pickingTime;
        
    }
}