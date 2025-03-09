class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
        int n = f.length;
        boolean placed;
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            placed = false;
            for (int j = 0; j < n; j++) {
                if (b[j] == 0) continue;
                if (b[j] >= f[i]) {
                    placed = true;
                    b[j] = 0;
                    break;
                }
            }
            if (!placed) cnt++;
        }
        
        return cnt;
    }
}