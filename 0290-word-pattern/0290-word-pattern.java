class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm = new HashMap<>();
        String[] words = s.split(" ");
        char ch;
        String word;
        
        if (pattern.length() != words.length) {
            return false;
        }
        
        for (int i = 0; i < pattern.length(); i++) {
            ch = pattern.charAt(i);
            word = words[i];
            if (hm.containsKey(ch)) {
                if (!hm.get(ch).equals(word)) {
                    return false;
                }
            } else if (hm.containsValue(word)) {
                return false;   
            } else {
                hm.put(ch, word);
            }
        }
        
        return true;
    }
}