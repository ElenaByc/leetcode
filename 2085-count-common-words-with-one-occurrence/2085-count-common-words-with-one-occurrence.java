class Solution {
    public int countWords(String[] words1, String[] words2) {
        int cnt = 0;
        HashMap<String, Integer> hm1 = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>();
        
        for (String s : words1) {
            hm1.put(s, hm1.getOrDefault(s, 0) + 1);
        }
        
        for (String s : words2) {
            hm2.put(s, hm2.getOrDefault(s, 0) + 1);
        }
        
        for (String key : hm1.keySet()) {
            if (hm1.get(key) == 1) {
                if (hm2.containsKey(key) && hm2.get(key) == 1) {
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
}