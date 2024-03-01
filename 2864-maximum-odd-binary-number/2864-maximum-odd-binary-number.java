class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                counter++;
            }
        }
        if (counter == 1) {
            return "0".repeat(n-1) + "1";
        }
        return "1".repeat(counter - 1) + "0".repeat(n - counter) + "1";
    }
}