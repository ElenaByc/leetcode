class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int counter1 = 0;
        int counter2 = 0;
        int n = s.length();
        char ch;
        
        for (int i = 0; i < n /2; i++) {
            ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                counter1++;
            }
            ch = s.charAt(n - 1 - i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                counter2++;
            }
        }
        
        return counter1 == counter2;
    }
}