class Solution {
    public boolean isAnagram(String s, String t) {
        int[] letters = new int[26];
        int lenS = s.length();
        int lenT = t.length();
        
        if (lenS != lenT) { 
            return false;
        }
        
        for (int i = 0; i < lenS; i++) {
            letters[s.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < lenT; i++) {
            letters[t.charAt(i) - 'a']--;
            if (letters[t.charAt(i) - 'a'] < 0) {
                return false;
            } 
        }
        
        return true;
    }
}