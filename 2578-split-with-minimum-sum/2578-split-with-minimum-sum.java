class Solution {
    public int splitNum(int num) {
        int n = Integer.toString(num).length();
        int[] arr = new int[n];
        int i = 0;
        while (num > 0) {
            arr[i] = num % 10;
            num /= 10;
            i++;
        }
        Arrays.sort(arr);

        int mul1;
        int mul2;

        if (n % 2 == 0) {
            mul1 = (int)Math.pow(10, n / 2 - 1);
            mul2 = mul1;
        } else {
             mul2 = (int)Math.pow(10, n / 2 - 1);
             mul1 = mul2 * 10;
        }

        int num1 = 0;
        int num2 = 0;

        for (i = 0; i < n; i++) {
            if (i % 2 == 0) {
                num1 += mul1 * arr[i];
                mul1 /= 10;
            } else {
                num2 += mul2 * arr[i];
                mul2 /= 10;
            }
        }
        
        return num1 + num2;
    }
}