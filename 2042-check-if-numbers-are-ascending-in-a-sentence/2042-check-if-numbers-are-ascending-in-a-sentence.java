class Solution {
    public boolean areNumbersAscending(String s) {
        int lastNum = -1;
        int currNum;
        int n = s.length();
        char ch;
        int j;
        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            if (ch <= '9' && ch >= '0') {
                j = i;
                while (j < n && s.charAt(j) <= '9' && s.charAt(j) >= '0') {
                    j++;
                }
                if (j > i) {
                    currNum = Integer.parseInt(s.substring(i,j));
                } else {
                    currNum = s.charAt(i) - '0';
                }
                if (currNum <= lastNum) {
                    return false;
                }
                lastNum = currNum;
                if (j > i) i = j - 1;
            }
        }
        return true;
    }
}