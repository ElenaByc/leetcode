class Solution {

    public double myPow(double x, int n) {
        long absN = (long) n;
        if (n < 0) {
            x = 1 / x;
            absN = -absN;
        }
        double pow = 1;
        while (absN > 0) {
            if ((absN & 1) != 0) {
                pow *= x;
            } 
            x *= x;
            absN >>= 1;
        }
        return pow;
    }
}