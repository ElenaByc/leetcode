class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] res = new int[2];
        int num;
        boolean noZero;
        for (int i = 1; i < n; i++) {
            num = n - i;
            noZero = true;
            while (num > 0 && noZero) {
                if (num % 10 == 0) {
                    noZero = false;
                } 
                num /= 10;
            }
            if (!noZero) {
                continue;
            }
            num = i;
            noZero = true;
            while (num > 0 && noZero) {
                if (num % 10 == 0) {
                    noZero = false;
                } 
                num /= 10;
            }
            if (!noZero) {
                continue;
            }
            return new int[]{i, n-i};
        }
        
        return res;
    }
}