class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int len = strs[0].length();
        char ch;
        int res = 0;
        for (int i = 0; i < len; i++) {
            ch = strs[0].charAt(i);
            for (int j = 0; j < n; j++) {
                if (strs[j].charAt(i) < ch) {
                    res++;
                    break;
                }
                ch = strs[j].charAt(i);
            }
        }
    
    return res;
        
    }
}