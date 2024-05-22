class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = num * (-1);
        
        for (int i = 1; i * i < num; i++) {
            if (num % i == 0) {
                sum += i;
                sum += num / i;
            }
        }
        
        return sum == num;
    }
}