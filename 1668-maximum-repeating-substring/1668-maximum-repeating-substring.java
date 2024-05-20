class Solution {
    public int maxRepeating(String s, String w) {
        int k = 0;
        int j = 0;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == w.charAt(j)) {
                int temp = i;
                // System.out.println("s: " + s.charAt(i) + " i = " + i);
                // System.out.println("w: " + w.charAt(j) + " j = " + j);
                while (i < s.length() && s.charAt(i) == w.charAt(j)) {
                    i++;
                    j++;
                    if (j == w.length()) {
                        cnt++;
                        j = 0;
                    }
                }
                if (i == s.length()) {
                    return Math.max(k, cnt);
                }
                i = temp;
                j = 0;
                k = Math.max(k, cnt);
                cnt = 0;
            }
        }
        
        return k;
    }
}