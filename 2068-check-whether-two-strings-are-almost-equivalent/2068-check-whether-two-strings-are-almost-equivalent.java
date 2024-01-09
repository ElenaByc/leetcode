class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] letters = new int[26];
        
        for (int i = 0; i < word1.length(); i++) {
            letters[word1.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < word2.length(); i++) {
            letters[word2.charAt(i) - 'a']--;
        }
        
        for (int i = 0; i < 26; i++) {
            if (letters[i] > 3 || letters[i] < -3) {
                return false;
            }
        }
        
        return true;
    }
}