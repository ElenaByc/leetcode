class Solution {
    public int minimumDeletions(String word, int k) {
        int[] letters = new int[26];
        int n = word.length();
        char ch;
        int max = 0;
        int min = n;
        for (int i = 0; i < n; i++) {
            ch = word.charAt(i);
            letters[ch -'a']++;
            max = Math.max(max, letters[ch - 'a']);
            min = Math.min(min, letters[ch - 'a']);
        }
        
        if (max - min <= k) {
            return 0;
        }
        
        int minCnt = n;
        int curCnt;
        for (int i = min; i <= max - k; i++) {
            curCnt = 0;
            for (int j = 0; j < 26; j++) {
                if (letters[j] > i + k) {
                    curCnt += letters[j] - (i + k);
                } else if (letters[j] < i) {
                    curCnt += letters[j];
                }
            }
            minCnt = Math.min(minCnt, curCnt);
        }
        
        return minCnt;
    }
}