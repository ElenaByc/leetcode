class Solution {
    public int numberOfSubstrings(String s, int k) {
        int n = s.length();
        
        if (k == 1) {
            return (1 + n) * n / 2;           
        }
        
        int ans = 0;
        int l = 0;
        int r = 0;
        int[] arr = new int[26];
        int maxFreq = 0;
        
        while (l < n) {
            char ch = s.charAt(l);
            arr[ch - 'a']++;
            maxFreq = 1;
            r = l + 1;
            while (r < n) {
                ch = s.charAt(r);
                arr[ch - 'a']++;
                maxFreq = Math.max(arr[ch - 'a'], maxFreq);
                if (maxFreq == k) {
                    ans += n - r;
                    // System.out.println("l = " + l + " r = " + r + " ans = " + ans);
                    r = n;
                } else {
                    r++;
                }
            }
            for (int i = 0; i < 26; i++) {
                arr[i] = 0;
            }
            l++;
        }
        
        return ans;
    }
}