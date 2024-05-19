class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int l = 0;
        int r = n - 1;
        while(l < r) {
             if (s.charAt(l) != s.charAt(r)) {
                
                if (r - l == 1) {
                    return true;
                }
                 boolean valid = true;
                // remove l 
                // check the rest if the string
                int l1 = l + 1;
                int r1 = r;
                while(l1 < r1) {
                    if (s.charAt(l1) != s.charAt(r1)) {
                        valid = false;
                        break;
                    }
                    l1++;
                    r1--;
                }
                if (valid) return true;
                valid = true;
                // remove r 
                // check the rest if the string
                l1 = l;
                r1 = r - 1;
                while(l1 < r1) {
                    if (s.charAt(l1) != s.charAt(r1)) {
                        return false;
                    }
                    l1++;
                    r1--;
                }
                return true;
            }
            l++;
            r--;
        }
        
        return true;
    }
}