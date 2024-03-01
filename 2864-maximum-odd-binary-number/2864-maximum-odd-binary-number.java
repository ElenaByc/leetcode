class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            counter += s.charAt(i) - '0';
        }
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < counter - 1; i++) {
            sb.append("1");
        }
        for (int i = 0; i < n - counter; i++) {
            sb.append("0");
        }
        
        sb.append("1");
        return sb.toString();
    }
}