class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        int base = 7;
        boolean sign = false;
        
        if (num == 0) return "0";
        
        if (num < 0) {
            sign = true;
            num = -num;
        }
        
        while (num > 0) {
            sb.append(num % base);
            num /= base;
        }
        if (sign) {
            sb.append('-');
        }
        sb.reverse();
        
        return sb.toString();
    }
}