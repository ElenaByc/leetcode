class Solution {
    public boolean checkZeroOnes(String s) {
        int max0 = 0;
        int max1 = 0;
        int len0 = 0;
        int len1 = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (len1 > 0) {
                    max1 = Math.max(max1, len1);
                    len1 = 0;
                }
                len0++;
            } else {
                if (len0 > 0) {
                    max0 = Math.max(max0, len0);
                    len0 = 0;
                }
                len1++;
            }
        }
        if (len1 > 0) {
            max1 = Math.max(max1, len1);
        } else {
            max0 = Math.max(max0, len0);
        }
        // System.out.println("max1 = " + max1);
        // System.out.println("max0 = " + max0);
        
        
        return max1 > max0;
    }
}