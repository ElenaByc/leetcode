class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        char ch1;
        char ch2;
        int idx1 = 0;
        int idx2 = 0;
        int n1 = word1.length;
        int n2 = word2.length;
        int p1 = 0;
        int p2 = 0;
        
        while (idx1 < n1 && idx2 < n2) {
            ch1 = word1[idx1].charAt(p1);
            ch2 = word2[idx2].charAt(p2);
            if (ch1 != ch2) {
                return false;
            }
            p1++;
            p2++;
            if (p1 == word1[idx1].length()) {
                idx1++;
                p1 = 0;
            }
            if (p2 == word2[idx2].length()) {
                idx2++;
                p2 = 0;
            }
        }
        
        if (idx1 == n1 && p1 == 0 && idx2 == n2 && p2 == 0) {
            return true;
        }
        
        return false;
        
    }
}