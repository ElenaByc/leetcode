class Solution {
    public int largestInteger(int num) {
        String str = Integer.toString(num);
        int n = str.length();
        if (n < 2) {
            return num;
        }
        boolean[] digits = new boolean[n];
        int[] odd = new int[n];
        int[] even = new int[n];
        int digit;
        int result = 0;
        for (int i = 0; i < n; i++) {
            digit = str.charAt(i) - '0';
            if (digit % 2 == 0) {
                digits[i] = true;
                even[i] = digit;
            } else {
                odd[i] = digit;
            }
        }
        
        Arrays.sort(even);
        Arrays.sort(odd);
        int mul = (int)Math.pow(10, n - 1);
        int pEven = n - 1;
        int pOdd = n - 1;
        for (int i = 0; i < n; i++) {
            if (digits[i]) {
                result += mul * even[pEven];
                pEven--;
            } else {
                result += mul * odd[pOdd];
                pOdd--;
            }
            mul /= 10;
        }
        
        return result;
    }
}