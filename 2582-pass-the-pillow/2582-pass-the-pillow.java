class Solution {
    public int passThePillow(int n, int time) {
        int p = 1;
        time %= 2 * (n - 1);
        
        if (time < n - 1) {
            p += time;
        } else {
            time -= n - 1;
            p = n;
            p -= time;
        }
        
        return p;
    }
}