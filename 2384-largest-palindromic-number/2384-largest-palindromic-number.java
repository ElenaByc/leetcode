class Solution {
    public String largestPalindromic(String num) {
        int freq[] = new int[10];
        StringBuilder sb = new StringBuilder();
        int mid = -1;

        for (int i = 0; i < num.length(); i++) {
            freq[num.charAt(i) - '0']++;
        }

        for (int i = 9; i >= 0; i--) {
            while (freq[i] >= 2 && (!sb.isEmpty() ||  i != 0)) {
                sb.append(i);
                freq[i] -= 2;
            }
            if (mid == -1 && freq[i] >= 1) {
                mid = i;
            }
        }
        if (mid == -1 && sb.isEmpty()) {
            return "0";
        }

        int n = sb.length();

        if (mid != -1) {
            sb.append(mid);
        }

        sb.append(new StringBuilder(sb.substring(0, n)).reverse());

        return sb.toString();
    } 
    
}