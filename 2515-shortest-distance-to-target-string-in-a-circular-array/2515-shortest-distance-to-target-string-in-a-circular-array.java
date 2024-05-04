class Solution {
    public int closetTarget(String[] words, String target, int start) {
        int n = words.length;
        int minDist = -1;
        for (int i = start; i < n + start; i++) {
            if (words[i % n].equals(target)) {
                minDist = i - start;
                break;
            }
        }
        
        for (int i = start; i > start - n; i--) {
            if (i < 0) {
                if (words[i + n].equals(target)) {
                    if (minDist == -1) {
                        minDist = start - i;
                    } else {
                        minDist = Math.min(minDist, start - i);
                    }
                    break;
                }
            } else {
               if (words[i].equals(target)) {
                    if (minDist == -1) {
                        minDist = start - i;
                    } else {
                        minDist = Math.min(minDist, start - i);
                    }
                    break;
                } 
            }
        }
        
        return minDist;
    }
}