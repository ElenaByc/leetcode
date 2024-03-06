class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        if (n < 3) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        char prevChar = s.charAt(0);
        char ch;
        for (int i = 1; i < n; i++) {
            ch = s.charAt(i);
            if (ch == prevChar) {
                cnt++;
            } else {
                for (int j = 0; j < Math.min(2,cnt); j++) {
                    sb.append(prevChar);
                }
                prevChar = ch;
                cnt = 1;
            }
        }
        for (int j = 0; j < Math.min(2,cnt); j++) {
            sb.append(prevChar);
        }
        return sb.toString();
    }
}