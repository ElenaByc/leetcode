class Solution {
    public int countVowelSubstrings(String word) {
        int n = word.length();
        int cnt = 0;
        char ch;
        Set<Character> set = new HashSet<>(); 
        
        
        for (int i = 0; i < n - 4; i++) {
            for (int j = i; j < n; j++) {
                ch = word.charAt(j);
                if (isVowel(ch)) {
                    set.add(ch);
                    if (set.size() == 5) {
                        cnt++;
                    }
                } else {
                    break;
                }
            }
            set.clear();
        }
           
        
        return cnt;
    }
    
    
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}