class Solution {
    public int minMaxDifference(int num) {
        char[] arr = Integer.toString(num).toCharArray(); 
        int n = arr.length;
        int maxNum = 0;
        int minNum = 0;
        int mul;
        char ch;
        int i = 0;
        while (i < n && arr[i] == '9') {
            i++;
        }
        if (i == n) { // all 9's
            maxNum = num;
        } else {
            mul = (int)Math.pow(10, n - 1);
            for (int j = 0; j < i; j++) {
                maxNum += 9 * mul;
                mul /= 10;
            }
            ch = arr[i];
            for (int j = i; j < n; j++) {
                if (arr[j] == ch) {
                    maxNum += 9 * mul;
                } else {
                    maxNum += (arr[j] - '0') * mul;
                }
                mul /= 10;
            }
        }

        mul = (int)Math.pow(10, n - 1);
        ch = arr[0];
        for (int j = 0; j < n; j++) {
            if (arr[j] != ch) {
                minNum += (arr[j] - '0') * mul;
            }
            mul /= 10;
        }
        
        return maxNum - minNum;
    }
}