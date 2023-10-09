class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        char ch = 0;
        
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (!set.add(ch)) {
                return ch;
            }
        }
        
        return ch;
    }
}