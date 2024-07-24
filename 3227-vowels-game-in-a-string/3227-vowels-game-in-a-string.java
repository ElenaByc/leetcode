class Solution {
    public boolean doesAliceWin(String s) {
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                return true;
            }
        }

        return false;
    }
}