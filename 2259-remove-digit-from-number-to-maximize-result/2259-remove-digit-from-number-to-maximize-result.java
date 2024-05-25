class Solution {
    public String removeDigit(String number, char digit) {
        StringBuilder sb = new StringBuilder(number);
        int n = number.length();
        char ch;
        int lastIndex = -1;
        for(int i = 0; i < n; i++) {
            ch = number.charAt(i);
            if (ch == digit) {
                if ( i < n - 1&& ch < number.charAt(i + 1)) {
                    return sb.deleteCharAt(i).toString();
                }
                lastIndex = i;
            }
        }
        
        return sb.deleteCharAt(lastIndex).toString();
        
    }
}