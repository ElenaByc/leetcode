class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] res = new int[2];
        for (int i = 1; i < n; i++) {
            if (Integer.toString(i).contains("0")) {
                continue;
            }
            if (Integer.toString(n - i).contains("0")) {
                continue;
            }
            return new int[]{i, n-i};
        }
        
        return res;
    }
}