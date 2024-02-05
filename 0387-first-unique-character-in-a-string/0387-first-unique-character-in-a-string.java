class Solution {
    public int firstUniqChar(String s) {
        // int[] letters = new int[26];
        HashMap<Character, Integer> hm = new HashMap<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            // letters[s.charAt(i)-'a']++;
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            // if (letters[s.charAt(i)-'a'] == 1) {
            //     return i;
            // }
            if (hm.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}