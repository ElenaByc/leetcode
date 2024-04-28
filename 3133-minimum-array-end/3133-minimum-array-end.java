class Solution {
    public long minEnd(int n0, int x0) {
        long n = n0 - 1, x = x0;
        for (int i = 0; n > 0; ++i) {
            if ((x & (1L << i)) == 0) {
                x |= (n & 1L) << i;
                n >>= 1;
            }
        }
        return x;
    }
}