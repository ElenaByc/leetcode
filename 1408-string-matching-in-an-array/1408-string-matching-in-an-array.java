class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        int n = words.length;
        String word;
        
        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
    
        
        for (int i = 0; i < n; i++) {
            word = words[i];
            for (int j = i + 1; j < n; j++) {
                if (words[j].indexOf(word) != -1) {
                    list.add(word);
                    break;
                }
            }
        }
        
        return list;
    }
}