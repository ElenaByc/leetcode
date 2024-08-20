class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int cnt0 = 0;
        int cnt1 = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '0') {
                cnt0++;
            } else {
                cnt1++;
            }
        }
        
        if (cnt0 <= k || cnt1 <= k) {
            // all substrings
            return (n + 1) * n / 2;
        }
        
        int ans = n; // all substrings with len = 1
        // System.out.println("ans = " + ans);
        for (int len = 2; len < n; len++) {
            
            for (int i = 0; i < n - len + 1; i++) {
                cnt0 = 0;
                for (int j = i; j < i + len; j++) {
                    if (s.charAt(j) == '0') {
                        cnt0++;
                    }
                }
                cnt1 = len - cnt0;
                if (cnt1 <= k || cnt0 <= k) {
                    ans++;
                }
                // System.out.println("i = " + i + " cnt0 = " + cnt0 + " cnt1 = " + cnt1);
                // System.out.println("i = " + i + " ans = " + ans);
                
            }
            // System.out.println("len = " + len + " ans = " + ans);
        }
        
        return ans;
    }
}