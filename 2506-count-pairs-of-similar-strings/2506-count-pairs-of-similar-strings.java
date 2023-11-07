class Solution {
    public int similarPairs(String[] words) {
        int cnt = 0;
        int n = words.length;
        List<HashSet<Character>> list = new ArrayList<>();
        HashSet<Character> set;
        
        for (String word: words) {
            set = new HashSet<>();
            for (int j = 0; j < word.length(); j++) {
                set.add(word.charAt(j));
            }
            list.add(set);
        }
        
        for (int i = 0; i < n; i++) {
            set = list.get(i);
            for (int j = i + 1; j < n; j++) {
                if (set.equals(list.get(j))) {
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
}