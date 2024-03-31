class Solution {
    public int countPrimes(int n) {
        int cnt = 0;
        
        boolean prime[] = new boolean[n];
        Arrays.fill(prime, true);

        for (int p = 2; p * p < n; p++) {
            if (prime[p]) {
                for (int i = p * p; i < n; i += p) {
                    prime[i] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                cnt++;
            }
        }
        return cnt;
    }
}