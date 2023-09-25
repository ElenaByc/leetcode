class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr = new int[26];
        char ch = '0';
        int position;
        
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            position = ch - 'a';
            arr[position]++;
        }
        
        for (int i = 0; i < t.length(); i++) {
            ch = t.charAt(i);
            position = ch - 'a';
            arr[position]--;
            if (arr[position] < 0) {
                return ch;
            }
        }
        
        return ch;
    }
}