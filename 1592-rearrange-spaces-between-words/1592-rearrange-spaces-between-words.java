class Solution {
    public String reorderSpaces(String text) {
        int cnt = 0;
        int n = text.length();
        StringBuilder sb = new StringBuilder();
        ArrayList<String> words = new ArrayList();
        
        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                cnt++;
                if (sb.length() > 0) {
                    words.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(ch);
            }
        }
        if (sb.length() > 0) {
            words.add(sb.toString());
            sb.setLength(0);
        }
        if (cnt == 0 || n == 1) {
            return text;
        }
        n = words.size();
        if (n == 1) {
            return words.get(0) + " ".repeat(cnt);
        }
        
        int spaces = cnt / (n - 1);
        int rem = cnt % (n - 1);
        
        return String.join(" ".repeat(spaces), words) + " ".repeat(rem);
    }
}