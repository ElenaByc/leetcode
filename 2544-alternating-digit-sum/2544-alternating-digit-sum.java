class Solution {
    public int alternateDigitSum(int n) {
        if (n < 10) return n;
        
        List<Integer> list = new ArrayList<>();
        
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }
        
        int sign = 1;
        int sum = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            sum += sign * list.get(i);
            sign = -sign;
        }
        
        return sum;
    }
}