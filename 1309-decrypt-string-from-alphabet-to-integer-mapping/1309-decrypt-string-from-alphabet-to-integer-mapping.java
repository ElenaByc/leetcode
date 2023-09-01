class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        char ch;
        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            if (i + 2 < n && s.charAt(i + 2) == '#') {
                sb.append((char)('j' + Integer.parseInt(s.substring(i, i + 2)) - 10));
                i += 2;
            } else {
                sb.append((char)(ch - '0' + 'a' - 1));
            }
        }
        
        return sb.toString();
    }
}