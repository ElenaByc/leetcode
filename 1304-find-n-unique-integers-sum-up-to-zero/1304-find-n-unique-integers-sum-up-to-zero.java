class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int i = 0;
        int num = 1;
        if (n % 2 != 0) {
            res[0] = 0;
            i++;
        }

        while (i < n) {
            res[i] = num;
            i++;
            res[i] = -num;
            i++;
            num++;
        }
        
        return res;
    }
}