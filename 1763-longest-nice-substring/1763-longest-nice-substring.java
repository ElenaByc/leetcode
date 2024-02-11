class Solution {
    public String longestNiceSubstring(String s) {
        int n = s.length();
        if (n < 2) return "";
        char ch;
        Set<Character> set = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            set.add(s.charAt(i));
        }

        
        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            if (set.contains(Character.toUpperCase(ch)) && set.contains(Character.toLowerCase(ch))) {
                continue;
            }
            String sub1 = longestNiceSubstring(s.substring(0, i));
            String sub2 = longestNiceSubstring(s.substring(i + 1));
            return sub1.length() >= sub2.length() ? sub1 : sub2;
        }
        
        return s; 
    }
}