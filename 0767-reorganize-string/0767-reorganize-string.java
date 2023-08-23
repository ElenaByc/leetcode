class Solution {
    public String reorganizeString(String s) {
        int[] hm = new int[26];
        int n = s.length();
        int max = -1;
        char letter;
        int idx = -1;
        char[] result = new char[n];
        
        
        for (int i = 0; i < n; i++) {
            hm[s.charAt(i) - 'a']++;
        } 
        
      
        for (int i = 0; i < 26; i++) {
            if (hm[i] > max) {
                max = hm[i];
                idx = i;
            }
        }
        
        letter = (char)(idx + 'a');
        hm[idx] = 0;
        idx = 0;
        
        // put letter on even positions (0, 2, 4, 6 ...)
        while (max > 0) {
            if (idx >= n) return "";
            result[idx] = letter;
            idx += 2;
            max--;
        }
        
        // fill the result with rest letters, even positions, then odd
        for (int i = 0; i < 26; i++) {
            while (hm[i] > 0) {
                if (idx >= n) {
                    idx = 1;
                }
                result[idx] = (char) (i + 'a');
                idx += 2;
                hm[i]--;
            }
        }
        
        return String.valueOf(result);
    }
}