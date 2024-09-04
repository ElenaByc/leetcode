class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int key = 0;
        int mul = 1;
        
        for (int i = 0; i < 4; i++) {
            int digit = Math.min(num1 % 10, num2 % 10);
            digit = Math.min(num3 % 10, digit);
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
            key += digit * mul;
            mul *= 10;
        }
        
        return key;
        
    }
}