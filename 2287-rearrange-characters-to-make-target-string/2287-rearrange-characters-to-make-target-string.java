class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character, Integer> hmS = new HashMap<>();
        HashMap<Character, Integer> hmT = new HashMap<>();
        int min = Integer.MAX_VALUE;
        char ch;
        
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            hmS.put(ch, hmS.getOrDefault(ch, 0) + 1);
        }
        
        for (int i = 0; i < target.length(); i++) {
            ch = target.charAt(i);
            hmT.put(ch, hmT.getOrDefault(ch, 0) + 1);
        }
        
        for (Character letter : hmT.keySet()) {
            if (!hmS.containsKey(letter)) {
                return 0;
            }
            min = Math.min(hmS.get(letter) / hmT.get(letter), min);
        }
        
        
        return min;
    }
}