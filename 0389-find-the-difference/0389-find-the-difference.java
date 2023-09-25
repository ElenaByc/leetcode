class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int val;
        char ch = '0';
        
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            val = hm.getOrDefault(ch, 0);
            val++;
            hm.put(ch, val);
        }
        
        for (int i = 0; i < t.length(); i++) {
            ch = t.charAt(i);
            val = hm.getOrDefault(ch, 0);
            if (val == 0) {
                return ch;
            }
            val--;
            if (val < 0) {
                return ch;
            }
            hm.put(ch, val);
        }
        
        return ch;
    }
}