class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int result = 0;
        for (String s : patterns) {
            if (word.indexOf(s) != -1) {
                result++;
            }
        }
        return result;
    }
}