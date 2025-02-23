class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder();
        
        while (sb1.length() > 2) {
            for (int i = 0; i < sb1.length() - 1; i++) {
                int d1 = sb1.charAt(i) - '0';
                int d2 = sb1.charAt(i + 1) - '0';
                sb2.append("" + ((d1 + d2) % 10));
            }
            // System.out.println(sb2.toString());
            sb1.setLength(0);
            sb1.append(sb2.toString());
            sb2.setLength(0);
        }
        
        return sb1.charAt(0) == sb1.charAt(1);
    }
}