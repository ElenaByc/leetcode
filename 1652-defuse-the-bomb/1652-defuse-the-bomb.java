class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        int idx;
        
        if (k == 0) return result;
        
        for (int i = 0; i < n; i++) {
            // System.out.println("i = " + i);
            for (int j = 1; j < Math.abs(k) + 1; j++) {
                idx = i + k / Math.abs(k) * j;
                if (idx >= n) {
                    idx -= n;
                } else if (idx < 0) {
                    idx += n;
                }
                // System.out.println("j = " + j + " idx = " + idx);
                result[i] += code[idx];
            }
            // System.out.println(Arrays.toString(result));
        }
        
        
        return result;
    }
}