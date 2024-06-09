class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int mod = 1000000007;
        int[] a = new int[n];
        Arrays.fill(a, 1);

        for (int i = 1; i <= k; i++) {
            int[] next = new int[n];
            next[0] = a[0];
            for (int j = 1; j < n; j++) {
                next[j] = (next[j - 1] + a[j]) % mod;
            }
            a = next;
        }
        
        return a[n - 1];
    }
}