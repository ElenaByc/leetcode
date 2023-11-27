class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;    
        for (String word : words) {
            if (canBeFormed(word, chars)) {
                sum += word.length();
            } 
        }
        return sum;
    }
    
    public boolean canBeFormed(String word, String chars) {
        HashMap<Character, Integer> hm = new HashMap<>();
        char ch;
        
        for (int i = 0; i < chars.length(); i++) {
            ch = chars.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            if (!hm.containsKey(ch)) return false;
            if (hm.get(ch) <= 0) return false;
            hm.put(ch, hm.get(ch) - 1);
        }
        
        return true;
    }
}