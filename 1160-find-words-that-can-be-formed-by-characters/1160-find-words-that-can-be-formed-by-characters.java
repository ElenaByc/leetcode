class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        int[] arr = new int[26];
        char ch;
        
        for (int i = 0; i < chars.length(); i++) {
            ch = chars.charAt(i);
            arr[ch - 'a']++;
        }
        
        for (String word : words) {
            if (canBeFormed(word, arr)) {
                sum += word.length();
            } 
        }
        return sum;
    }
    
    public boolean canBeFormed(String word, int[] arr) {
        int[] arr2 = new int[26];
        char ch;
        
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            if (arr[ch - 'a'] == 0) return false;
            arr2[ch - 'a']++;
            if (arr2[ch - 'a'] > arr[ch - 'a']) return false;
        }
        
        return true;
    }
}