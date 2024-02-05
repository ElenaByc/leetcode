class Solution {
    public int firstUniqChar(String s) {
        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i)-'a']++;
        }
        boolean noAnswer = true;
        for (int i = 0; i < 26; i++) {
            if (letters[i] == 1) {
                noAnswer = false;
                break;
            }
        }
        if (noAnswer) {
            return -1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (letters[s.charAt(i)-'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}