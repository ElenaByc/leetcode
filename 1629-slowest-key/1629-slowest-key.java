class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char longestKey = keysPressed.charAt(0);
        int maxTime = releaseTimes[0];
        int time;
        
        for (int i = 1; i < releaseTimes.length; i++) {
            time = releaseTimes[i] - releaseTimes[i-1];
            if (time > maxTime) {
                maxTime = time;
                longestKey = keysPressed.charAt(i);
            } else if (time == maxTime) {
                if (keysPressed.charAt(i) > longestKey) {
                    longestKey = keysPressed.charAt(i);
                }
            }
        }
        return longestKey;
    }
}