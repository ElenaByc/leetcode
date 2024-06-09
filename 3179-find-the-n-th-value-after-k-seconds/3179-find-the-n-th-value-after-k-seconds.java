class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int mod = 1000000007;
        int[] a = new int[n];
        Arrays.fill(a, 1);

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j < n; j++) {
                a[j] = (a[j - 1] + a[j]) % mod;
            }
        }
        
        return a[n - 1];
    }
}