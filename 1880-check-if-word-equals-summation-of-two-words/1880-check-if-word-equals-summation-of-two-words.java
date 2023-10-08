class Solution {
    public boolean isSumEqual(String s1, String s2, String target) {
        return value(s1) + value(s2) == value(target);
    }
    
    public int value(String s) {
        int sum = 0;
        int mul = (int)Math.pow(10, s.length() - 1);
        for (int i = 0; i < s.length(); i++) {
            sum += (s.charAt(i) - 'a') * mul;
            mul /= 10;
        }
        // System.out.println(s + " " + sum);
        return sum;
    }
}