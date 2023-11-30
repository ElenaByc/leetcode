class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> hm = new HashMap<>();
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        List<String> list = new ArrayList<>();
        
        for (String word : words1) {
            hm.put(word, hm.getOrDefault(word, 0) + 1);
        }
        
        for (String word : words2) {
            hm.put(word, hm.getOrDefault(word, 0) + 1);
        }
        
        for (String word : hm.keySet()) {
            if (hm.get(word) == 1) {
                list.add(word);
            }
        }
        
        int n = list.size();
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}