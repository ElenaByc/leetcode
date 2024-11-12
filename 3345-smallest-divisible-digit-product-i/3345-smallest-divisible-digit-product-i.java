class Solution {
    public int smallestNumber(int n, int t) {
        if (n % 10 == 0) return n;
        if (t == 1) return n;
        int prod;
        for (int i = 0; i < 10; i++) {
            int m = n + i;
            if ( m >= 10 ) {
                prod = m % 10 * (m / 10);
            } else {
                prod = m;
            }
            // System.out.println(prod);
            if (prod % t == 0) {
                return m;
            }
        }
        
        return 0;
    }
}