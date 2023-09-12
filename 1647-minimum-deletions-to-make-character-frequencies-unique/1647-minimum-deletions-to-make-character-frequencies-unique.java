class Solution {
    public int minDeletions(String s) {
        int[] arr = new int[26];
        int res = 0;
        Set<Integer> used = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++)
            arr[s.charAt(i) - 'a']++;
        
        for (int i = 0; i < 26; i++) {
            // used.add(arr[i]) = true if arr[i] was added, so used.contains(arr[i]) was false
            while (arr[i] > 0 && !used.add(arr[i])) {
                arr[i]--;
                res++;
            }
        }        
        return res;
    }
}