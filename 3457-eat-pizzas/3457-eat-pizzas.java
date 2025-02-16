class Solution {
    public long maxWeight(int[] p) {
        long max = 0;
        Arrays.sort(p);
        int n = p.length;
        int days = n / 4;
        int idx = n - 1;
        
        for (int i = 1; i <= days; i += 2) { // odd
            max += p[idx];
            idx--;
        }
        idx--;
        for (int i = 2; i <= days; i += 2) { // even
            max += p[idx];
            idx -= 2;
        }
        
        
        return max;
    }
}