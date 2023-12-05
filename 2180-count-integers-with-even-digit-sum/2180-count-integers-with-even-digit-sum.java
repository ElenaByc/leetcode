class Solution {
    public int countEven(int num) {
        int result = 0;
        
        for (int i = 1; i <= num; i++) {
            if (isDigitsSumEven(i)) {
                result++;
            }
        }
        
        return result;
    }
    
    public boolean isDigitsSumEven(int num) {
        int sum = 0;
        
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        return (sum % 2 == 0);
    }
}