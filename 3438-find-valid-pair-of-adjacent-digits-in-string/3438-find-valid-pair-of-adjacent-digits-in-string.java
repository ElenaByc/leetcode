class Solution {
    public String findValidPair(String s) {
        int[] digits = new int[10];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            digits[ch - '0']++;
        }

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (digits[ch - '0'] == ch - '0') {
                if (i < s.length() - 1) {
                    char ch2 = s.charAt(i + 1);
                    if (ch2 != ch && digits[ch2 - '0'] == ch2 - '0') {
                        return "" + ch + ch2;
                    }
                }
            }
        }

        return "";
    }
}