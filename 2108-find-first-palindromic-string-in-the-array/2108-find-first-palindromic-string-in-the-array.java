class Solution {
    public String firstPalindrome(String[] words) {
        for (String str : words) {
            if (isPalindrome(str)) {
                return str;
            }
        }
        return "";
    }
    
    public boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}