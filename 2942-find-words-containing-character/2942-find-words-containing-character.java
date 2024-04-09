class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        var list = new ArrayList<Integer>();
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("" + x)) {
                list.add(i);
            }
        }
        
        return list;
    }
}