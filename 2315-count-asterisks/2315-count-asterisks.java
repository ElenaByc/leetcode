class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        int pairs = 0;
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == '|') { 
                pairs++;
                continue;
            }
            if (ch == '*' && pairs % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}