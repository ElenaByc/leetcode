class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == '(') {
                cnt++;
                sb.append(ch);
            } else if (ch == ')') {
                cnt--;
                if (cnt >= 0) {
                    sb.append(ch);
                } else {
                    cnt++;
                    // do not add this ')'
                }
            } else { // not '(' or ')'
                sb.append(ch);
            }
        }
        s = sb.toString();
        
        if (cnt == 0) { // valid
            return s;
        }
        sb.setLength(0);
        cnt = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            ch = s.charAt(i);
            if (ch == ')') {
                cnt++;
                sb.append(ch);
            } else if (ch == '(') {
                cnt--;
                if (cnt >= 0) {
                    sb.append(ch);
                } else {
                    cnt++;
                    // do not add this ')'
                }
            } else { // not '(' or ')'
                sb.append(ch);
            }
        }
        
        return sb.reverse().toString();
        
        
    }
}