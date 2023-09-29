class Solution {
    public String sortString(String s) {
        int n = s.length();
        char ch;
        StringBuilder sb = new StringBuilder();
        char[] arr = new char[26];
        
        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            arr[ch - 'a']++;
        }
        
        
        while (sb.length() < n) {
            for (int i = 0; i < 26; i++) {
                if (arr[i] > 0) {
                    sb.append((char)('a' + i));
                    arr[i]--;
                } 
            }
            for (int i = 25; i >= 0; i--) {
                if (arr[i] > 0) {
                    sb.append((char)('a' + i));
                    arr[i]--;
                } 
            }
        }

        return sb.toString();
    }
}