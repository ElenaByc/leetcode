class Solution {
    public String decodeAtIndex(String s, int k) {
        long n = 0; // length of decoded string
        int i;
        int ch = 0;
        // decode stirng unil n >= k
        for (i = 0; n < k; i++) {
            ch = s.charAt(i);
            if (Character.isDigit(ch)) { // repeat string (ch - '0') times
                n *= (ch - '0'); 
            } else { // add one char
                n++;
            }
        }

        i--; // last index of string that was decoded

        while (i >= 0) {
            ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                n /= (ch - '0');
                k %= n;
            } else {
                if (k % n == 0) {
                    break;
                }
                n--;
            }
            i--;
        }

        return Character.toString(ch);
    }
}