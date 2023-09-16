class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                res.add(i);
            }
        }
        
        return res;
    }
    
    public boolean isSelfDividing(int num) {
        int n = num;
        int digit;
        
        while (n > 0) {
            digit = n % 10;
            if (digit == 0) {
                return false;
            }    
            if (num % digit != 0) {
                return false;
            }
            n /= 10;
        }
        
        return true;
    }
}