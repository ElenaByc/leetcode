class Solution {
    public int numSteps(String s) {
        int cnt = 0;
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() > 1) {
            int n = sb.length() - 1;
            if (sb.charAt(n) == '0') {
                // even, remove it
                sb.deleteCharAt(n); 
            } else {
                // odd, add 1
                while (n >= 0 && sb.charAt(n) == '1') {
                    sb.setCharAt(n, '0');
                    n--;
                }
                if (n >= 0) {
                    sb.setCharAt(n, '1');
                } else {
                    sb.insert(0, '1');
                }
            }
            cnt++;
        }
    
        
        return cnt;
    }
}