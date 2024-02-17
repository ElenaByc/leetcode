class Solution {
    public boolean isThree(int n) {
        if (n < 2) {
            return false;
        }
        int cnt = 2;
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                cnt++;
            }
            i++;
        }
        
        return cnt == 3;
    }
}