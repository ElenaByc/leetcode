class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        int num;
        for (String s : sentences) {
            num = s.split(" ").length;
            if (num > max) max = num;
        }
        return max;
    }
}