class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = Set.of(new Character[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'});
        
        int counter1 = 0;
        int counter2 = 0;
        int n = s.length();
        
        for (int i = 0; i < n /2; i++) {
            if (vowels.contains(s.charAt(i))) {
                counter1++;
            }
            if (vowels.contains(s.charAt(n - 1 - i))) {
                counter2++;
            }
        }
        
        return counter1 == counter2;
    }
}