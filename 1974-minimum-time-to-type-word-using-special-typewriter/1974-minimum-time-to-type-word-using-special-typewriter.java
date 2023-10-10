class Solution {
    public int minTimeToType(String word) {
        int minTime = 0;
        char prevCh = 'a';
        char currCh;
        for (int i = 0; i < word.length(); i++) {
            currCh = word.charAt(i);
            minTime += Math.min(clockwiseDistance(prevCh, currCh), counterclockwiseDistance(prevCh, currCh)) + 1;
            prevCh = currCh;
        }

        return minTime;
    }

    public int clockwiseDistance (char prevCh, char currCh) {
        if (currCh >= prevCh) {
            return currCh - prevCh;
        } else {
            return 26 - (prevCh - currCh);
        }
    }

    public int counterclockwiseDistance (char prevCh, char currCh) {
        if (currCh > prevCh) {
            return 26 - (currCh - prevCh);
        } else {
            return prevCh - currCh;
        }
    }
}