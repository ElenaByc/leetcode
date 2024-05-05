class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        int difCnt = 0;
        char[] difCharPair1 = new char[2];
        
        for(int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                continue;
            } else {
                difCnt++;
                if (difCnt > 2) {
                    return false;
                }
                if (difCnt == 1) {
                    difCharPair1[0] = s1.charAt(i);
                    difCharPair1[1] = s2.charAt(i);
                } else {
                    if (difCharPair1[0] != s2.charAt(i) || difCharPair1[1] != s1.charAt(i)) {
                        return false;
                    }
                }
            }
        }
        
        return difCnt == 0 || difCnt == 2;
    }
}