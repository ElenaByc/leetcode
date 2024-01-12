class Solution {
    public boolean halvesAreAlike(String s) {
        int vowels = 0;
        int n =  s.length();
        for (int i = 0; i < n; i++) {
            if (isVowel(s.charAt(i))) {
                if (i < n / 2) {
                    vowels++;
                } else {
                    vowels--;
                }
            }
        }
                        
        return vowels == 0;
    }
                        
    public static boolean isVowel (char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch ==  'o' || ch ==  'u' || ch ==  'A' || ch ==  'E' || ch ==  'I' || ch ==  'O' || ch ==  'U';
    }
}