class Solution {
    public boolean isAnagram(String s, String t) {
              if (s.length() != t.length()) {
            return false;
        }
        int len = s.length();
        int[] arr = new int[26];
        Arrays.fill(arr, 0);

        for (int i = 0; i < len; i++) {
            arr[s.charAt(i) - 'a'] += 1;
            arr[t.charAt(i) - 'a'] -= 1;
        }

        for (int el : arr) {
            if (el != 0) {
                return false;
            }
        }

        return true;
    }
}