class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        
        int num = 0;
        for (int i = 0; i < 26; i++) {
            if (num == 0 && arr[i] != 0) {
                num = arr[i];
            }
            if (arr[i] != 0 && arr[i] != num) {
                return false;
            }
        }
        
        return true;
    }
}