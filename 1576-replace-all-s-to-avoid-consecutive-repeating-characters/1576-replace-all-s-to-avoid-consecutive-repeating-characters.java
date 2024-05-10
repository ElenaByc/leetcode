class Solution {
    public String modifyString(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        char left = '0', right, curr, ch;
        for (int i = 0; i < n; i++) {
            curr = s.charAt(i);
            if (curr == '?') {
                ch = 'a';
                if (i + 1 < n) {
                    right = s.charAt(i + 1);
                    while (ch == right || ch == left) {
                        ch++;
                    }
                } else {
                    while (ch == left) {
                        ch++;
                    }
                }
                sb.append(ch);
                left = ch;
            } else {
                sb.append(curr);
                left = curr;
            }
        }
        
        return sb.toString();
    }
}