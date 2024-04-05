class Solution {
    public String makeGood(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        char ch;
        char prevCh;
        
        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            if (sb.length() > 0) {
                prevCh = sb.charAt(sb.length() - 1);
                if (ch != prevCh && Character.toLowerCase(ch) == Character.toLowerCase(prevCh)) {
                    // do not add this ch
                    // remove last ch from sb
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    sb.append(ch);
                }
            } else {
                sb.append(ch);
            }
        }
        
        return sb.toString();
            
    }
}