class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int carry = 0;
        List<Integer> sum = new ArrayList<>();
        
        int i = num.length - 1;
        int digit;
        while (k > 0 && i >= 0) {
            digit = k % 10 + num[i] + carry;
            carry = digit / 10;
            sum.add(digit % 10);
            i--;
            k /= 10;
        }
        
        while (i >= 0) {
            digit = num[i] + carry;
            carry = digit / 10;
            sum.add(digit % 10);
            i--;
        }
        
        while (k > 0) {
            digit = k % 10 + carry;
            carry = digit / 10;
            sum.add(digit % 10);
            k /= 10;
        }
        
        if (carry > 0) {
            sum.add(carry);
        }
        
        Collections.reverse(sum);
        return sum;
    }
}