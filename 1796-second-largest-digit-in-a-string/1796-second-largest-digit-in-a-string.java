class Solution {
    public int secondHighest(String s) {
        char ch;
        int digit;
        int max = -1;
        int second = -1;
        
        
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
                if (digit > max) {
                    second = max;
                    max = digit;
                } else if (digit > second && digit != max) {
                    second = digit;
                }
            }
        }
        
        return second;        
    }
}