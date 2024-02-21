class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] letters = new int[26];
        int cnt = 0;
        char ch;
        String str = licensePlate.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                letters[ch - 'a']++;
                cnt++;
            }
        }
        int min = Integer.MAX_VALUE;
        String minWord = "";
        int[] lettersW;
        boolean isValid;
        for (String word : words) {
            if (word.length() < cnt) {
                continue;
            }
            lettersW = new int[26];
            isValid = true;
            for (int i = 0; i < word.length(); i++) {
                ch = word.charAt(i);
                lettersW[ch - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (lettersW[i] < letters[i]) {
                    isValid = false;
                    break;
                }
            }
            if (isValid && word.length() < min) {
                min = word.length();
                minWord = word;
            }
        }
        
        return minWord;
    }
}