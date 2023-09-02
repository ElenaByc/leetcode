class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            if (n % 2 == 0) sb.append(1);
            else sb.append(0);
            n /= 2;
        }
        String complement = sb.toString();
        int digit;
        int power = 1;
        int result = 0;
        for (int i = 0; i < complement.length(); i++) {
            digit = complement.charAt(i) - '0';
            result += digit * power;
            power *= 2;
        }
        return result;
    }
}