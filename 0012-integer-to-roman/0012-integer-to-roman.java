class Solution {
    public String intToRoman(int n) {
        int[] values = {1000, 500, 100, 50, 10, 5, 1};
        char[] chars = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        StringBuilder sb = new StringBuilder();
        int quotient;

        for (int i = 0; i < values.length; i++) {
            quotient = n / values[i];
            if (quotient == 4) { //  for example: 450 / 100 = 4   =>   CCCC -> CD
                if (sb.length() == 0 || sb.charAt(sb.length() - 1) != chars[i - 1]) {
                    sb.append(chars[i]);
                    sb.append(chars[i - 1]);
                } else { // for example: DCCCC -> CM
                    sb.deleteCharAt(sb.length() - 1);
                    sb.append(chars[i]);
                    sb.append(chars[i - 2]);
                }
            } else {
                for (int j = 0; j < quotient; j++) {
                    sb.append(chars[i]);
                }
            }
            n %= values[i];
        }

        return sb.toString();
    }
}