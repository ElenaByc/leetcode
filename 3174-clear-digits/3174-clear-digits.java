class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}