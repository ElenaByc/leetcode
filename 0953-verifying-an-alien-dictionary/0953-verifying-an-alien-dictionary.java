class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int n = words.length;
        if (n == 1) {
            return true;
        }
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[order.charAt(i) - 'a'] = i;
        }
        int p;
        int n1 = words[0].length();
        int n2;
        for (int i = 1; i < n; i++) {
            // compare words[i] and words[i-1]
            p = 0;
            n2 = words[i].length();
            while (p < n1 && p < n2 && words[i-1].charAt(p) == words[i].charAt(p)) {
                p++;
            }
            if (p < n1 && p < n2 && words[i-1].charAt(p) != words[i].charAt(p)) {
                if (arr[ words[i-1].charAt(p) - 'a'] > arr[words[i].charAt(p) - 'a']) {
                    return false;
                }
            } else if (n1 > n2) {
                return false;
            }
            n1 = n2;
        }
        
        return true;
    }
}