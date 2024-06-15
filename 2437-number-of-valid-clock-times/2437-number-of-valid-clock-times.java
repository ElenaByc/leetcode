class Solution {
    public int countTime(String time) {
        char h1, h2, m1, m2;
        h1 = time.charAt(0);
        h2 = time.charAt(1);
        m1 = time.charAt(3);
        m2 = time.charAt(4);
        
        int ph = 1;
        int pm = 1;
        
        if (h1 == '?' && h2 == '?') {
            ph = 24;
        } else if (h1 == '?') {
            int h = (int)(h2 - '0');
            if (h > 3) {
                ph = 2;
            } else {
                ph = 3;
            }
        } else if (h2 == '?') {
            int h = (int)(h1 - '0');
            if (h < 2) {
                ph = 10;
            } else {
                ph = 4;
            }
        }
        
        if (m1 == '?' && m2 == '?') {
            pm = 60;
        } else if (m1 == '?') {
            pm = 6;
        } else if (m2 == '?') {
            pm = 10;
        }
            
        
        return ph * pm;
    }
}