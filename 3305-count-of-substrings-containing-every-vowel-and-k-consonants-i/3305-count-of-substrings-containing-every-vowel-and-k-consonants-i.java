class Solution {
    public int countOfSubstrings(String word, int k) {
        int l = 0;
        int r = 0;
        int n = word.length();
        int ans = 0;
        int cnt = 0;
        char ch;
        
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        Set<Character> set = new HashSet<>();
        
        while (l < n) {
            r = l;
            while (r < n && cnt <= k) {
                ch = word.charAt(r);
                if (vowels.contains(ch)) {
                    set.add(ch);
                } else {
                    cnt++;
                }
                if (set.size() == 5 && cnt == k) {
                    ans++;
                    // System.out.println("[" + l + ", " + r + "]");
                }
                r++;
            }
            set.clear();
            cnt = 0;
            l++;
        }
        
        return ans;
    }
}