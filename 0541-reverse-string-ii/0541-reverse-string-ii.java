class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = s.length();
        while (i < n) {
            if (i + k < n) {
                // reverse
                for (int j = i + k - 1; j >= i; j--) {
                    sb.append(s.charAt(j));
                }
            } else {
                for (int j = n - 1; j >= i; j--) {
                    sb.append(s.charAt(j));
                }
            }
            i += k;
            if (i + k < n) {
                sb.append(s.substring(i, i + k));
            } else if (i < n) {
                sb.append(s.substring(i));
            }
            i += k;
        }
        
        
        return sb.toString();
    }
}