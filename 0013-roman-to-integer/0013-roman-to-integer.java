class Solution {
    public int romanToInt(String s) {
        char ch;
        char nextCh;
        int val;
        int n = s.length();
        int num = 0;

        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            val = charValue(ch);
            if (i + 1 < n) {
                nextCh = s.charAt(i + 1);
                if (charValue(nextCh) > val) { // for example CM = 900 = 1000 - 100
                    val = charValue(nextCh) - val;
                    i++;
                }
            }
            num += val;
        }

        return num;
    }


    public int charValue(char ch) {
        switch (ch) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return -1;
        }
    }
}