class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        if (n == 1) {
            return true;
        }
        
        int[] mapS = new int[200];
        int[] mapT = new int[200];

        for(int i = 0; i < n; i++) {
            if(mapS[s.charAt(i)] != mapT[t.charAt(i)]) {
                return false;
            }
            mapS[s.charAt(i)] = i+1;
            mapT[t.charAt(i)] = i+1;
        }
        
        return true;
    }
}