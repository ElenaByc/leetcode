class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        if (weeks == 0) {
            return (1 + n) * n / 2;
        }
        int result = 0;
        for (int i = 1; i <= weeks; i++) {
            result += (i  + 3) * 7;
        }
        
        int rem = n % 7;
        result += (weeks + 1 + rem + weeks) * rem / 2;

        return result;
    }
}