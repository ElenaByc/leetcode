class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int num1 = 0;
        int num2 = 0;
        char ch;
        
        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            if (i % 2 == 0) {
                if (ch == '0') {
                    num2++;
                } else {
                    num1++;
                }
            } else {
                if (ch == '1') {
                    num2++;
                } else {
                    num1++;
                }
            }
        }
        
        
        
        return Math.min(num1, num2);
    }
}