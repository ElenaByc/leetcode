class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        boolean consistent;
        for (String word : words) {
            consistent = true;
            for (int i = 0; i < word.length(); i++) {
                if (allowed.indexOf(word.charAt(i)) == -1) {
                    consistent = false;
                    break;
                }
            }
            if (consistent) {
                count++;
            }
        }
        return count;
    }
}