class Solution {
    public int minChanges(int n, int k) {
        if (n == k) {
            return 0;
        }
        int cnt = 0;
        while (n > 0 || k > 0) {
            int dn = n % 2;
            int dk = k % 2;
            if (dn == 1 && dk == 0) {
                cnt++;
            } else if (dn == 0) {
                if (dk == 1) {
                    return -1;
                }
            }
            n /= 2;
            k /= 2;
        }
        
        return cnt;
    }
}