class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb.append(s);
        int n = sb.length();
        int sum;
        
        while (n > k) {  
//             System.out.println(sb.toString());
//             System.out.println(n);
            for (int i = 0; i < n; i += k) {
                sum = 0;
                for (int j = 0; j < k; j++) {
                    if (i + j < n) {
                        sum += sb.charAt(i + j) - '0';
                    }
                }
                sb2.append(Integer.toString(sum));
            }
            sb.delete(0, n);
            sb.append(sb2.toString());
            n = sb.length();
            sb2.delete(0, sb2.length());
        }
        
        return sb.toString();
    }
}