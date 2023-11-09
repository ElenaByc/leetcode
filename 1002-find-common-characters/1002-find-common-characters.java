class Solution {
    public List<String> commonChars(String[] words) {
        List<String> common = new ArrayList<>();
        int n = words.length;
        int[][] freq = new int[n][26];
        char ch;
        int min;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                ch = words[i].charAt(j);
                freq[i][ch - 'a']++;
            }
        }
        
        for (int j = 0; j < 26; j++) {
            if (freq[0][j] == 0) {
                continue;
            }
            min = freq[0][j];
            for (int i = 1; i < n; i++) {
                min = Math.min(freq[i][j], min);
                if (min == 0) {
                    break;
                }
            }
            if (min == 0) {
                continue;
            } 
            ch = (char)('a' + j);
            for (int k = 0; k < min; k++) {
                common.add("" + ch);
            }
        }
        
        
        return common;
    }
}