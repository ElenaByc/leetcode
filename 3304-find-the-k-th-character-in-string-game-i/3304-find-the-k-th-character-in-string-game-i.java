class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb.append("a");
        while(sb.length() < k) {
            for (int i = 0; i < sb.length(); i++) {
                char ch = sb.charAt(i);
                if (ch == 'z') {
                    sb2.append("a");
                } else {
                    ch++;
                    sb2.append(ch);
                }
            }
            sb.append(sb2);
            
            sb2.setLength(0);
        }

        return sb.charAt(k-1);
    }
}