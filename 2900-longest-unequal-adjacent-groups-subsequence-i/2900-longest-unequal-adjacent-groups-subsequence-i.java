class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        var list = new ArrayList<String>();
        list.add(words[0]);
        int lastIdx = 0;
        for (int i = 1; i < words.length; i++) {
            if (groups[i] != groups[lastIdx]) {
                list.add(words[i]);
                lastIdx = i;
            }
        }
        
        return list;
    }
}