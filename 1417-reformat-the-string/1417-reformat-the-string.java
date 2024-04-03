class Solution {
    public String reformat(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int n = s.length();
        char ch;
        
        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                letters.append(ch);
            } else {
                digits.append(ch);
            }
        }
        
        if (Math.abs(letters.length() - digits.length()) > 1) {
            return "";
        }
        
        int l = 0;
        int d = 0;

        if (letters.length() > digits.length()) {
            result.append(letters.charAt(l));
            l++;
        } 
        while (l + d < n) {
            result.append(digits.charAt(d));
            if (l < letters.length()) {
                result.append(letters.charAt(l));
            }
            l++;
            d++;
        }
        
        
        return result.toString();
    }
}