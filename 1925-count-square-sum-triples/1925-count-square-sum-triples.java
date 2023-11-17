class Solution {
    public int countTriples(int n) {
        int cnt = 0;
        double c;
        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                c = Math.sqrt(a * a + b * b);
                if ( c == Math.floor(c) && c <= n) {
                    cnt++;
                    // System.out.println("(" + a + "," + b + "," + c +")");
                }       
            }
        }
        return cnt;
    }
}