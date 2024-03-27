class Solution {
    public String thousandSeparator(int n) {
        String str = Integer.toString(n);
        int len = str.length();
        if (len <= 3) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (cnt > 0 && cnt % 3 == 0) {
                sb.append('.');
            }
            sb.append(str.charAt(i));
            cnt++;
        }
        sb.reverse();
        return sb.toString();
    }
}