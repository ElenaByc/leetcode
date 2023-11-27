class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        char ch;
        
        for (int i = 0; i < chars.length(); i++) {
            ch = chars.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        
        for (String word : words) {
            if (canBeFormed(word, hm)) {
                sum += word.length();
            } 
        }
        return sum;
    }
    
    public boolean canBeFormed(String word, HashMap<Character, Integer> hm) {
        HashMap<Character, Integer> hm2 = new HashMap<>();
        char ch;
        
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            if (!hm.containsKey(ch)) return false;
            hm2.put(ch, hm2.getOrDefault(ch, 0) + 1);
            if (hm2.get(ch) > hm.get(ch)) return false;
        }
        
        return true;
    }
}