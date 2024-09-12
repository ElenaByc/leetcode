class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt = 0;
        int n = allowed.length();
        boolean good = true;
        int arr[] = new int[26];
        
        for (int i = 0; i < n; i++) {
            arr[allowed.charAt(i) - 'a']++;
        }
        
        for (var w : words) {
            good = true;
            for (int j = 0; j < w.length(); j++) {
                char ch = w.charAt(j);
                if (arr[ch - 'a'] == 0) {
                    good = false;
                    break;
                }
            }
            if (good) cnt++;
        }
        
        return cnt;
    }
}