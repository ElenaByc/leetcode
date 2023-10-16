class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        String substr;
        int counter = 0;
        
        if (n < 3) {
            return 0;
        }
        
        for (int i = 0; i < n - 2; i++) {
            substr = s.substring(i, i + 3);
            if (isGood(substr)) {
                // System.out.println(substr);
                counter++;
            }
        }
        
        return counter;
    }
    
    public boolean isGood(String s) {
        char ch0 = s.charAt(0);
        char ch1 = s.charAt(1);
        char ch2 = s.charAt(2);
        if (ch0 == ch1 || ch0 == ch2 || ch1 == ch2 ) {
            return false;
        }
        return true;
    }
}