class Solution {
    long f(String s, int d) {
        int n = s.length();
        long[][] xs = new long [n + 1][d];
        for (int i = 0; i < n; ++i) {
            int ch = s.charAt(i) - '0';
            for (int j = 0; i > 0 && j < d; ++j) {
                xs[i][(j * 10 + ch) % d] += xs[i-1][j];
            }
            xs[i][ch % d]++;
        }
        long m = 0;
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) - '0' == d) {
                m += xs[i][0];
                // System.out.println(d + " " + i + " " + xs[i][0]);
              //  if (d == 6) {
            //        for (int k = 0; k < d; ++k) System.out.println("  " + xs[i-1][k]);
            //    }
            }
        }
        return m;
    }
    public long countSubstrings(String s) {
        long m = 0;
        for (int d = 1; d <= 9; ++d) m += f(s, d);
        return m;
    }
}