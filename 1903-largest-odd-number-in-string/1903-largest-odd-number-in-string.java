class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        int digit;
        for (int i = n - 1; i >= 0; i--) {
            digit = num.charAt(i) - '0';
            if (digit % 2 == 1) {
                if (i == n - 1) return num;
                if (i == 0) return num.substring(0, 1);
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}