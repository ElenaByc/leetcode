class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        int idx;
        if (k == 0) return result;
        
        //Define the initial window and initial sum
        int start = 1, end = k, sum = 0;
        if (k < 0) {
            k = -k;
            start = n - k;
            end = n - 1;
        }
        for (int i = start; i <= end; i++) sum += code[i];
        //Scan through the code array as i moving to the right, update the window sum.
        for (int i = 0; i < n; i++) {
            result[i] = sum;
            sum -= code[(start++) % n];
            sum += code[(++end) % n];
        }
        
        return result;
    }
}