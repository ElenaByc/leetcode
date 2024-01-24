class Solution {
    public int minOperations(String[] logs) {
        int level = 0;
        for (String s : logs) {
            if (s.equals("../")) {
                if (level > 0) {
                    level--;
                }
            } else if (s.equals("./")) {
                // do nothing, remain in the same folder
            } else {
                level++;
            }
        }
        return level;
    }
}