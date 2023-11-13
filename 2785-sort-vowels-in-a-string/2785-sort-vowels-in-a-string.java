class Solution {
    public String sortVowels(String s) {
        int n = s.length();
        List<Character> vowels = new ArrayList<>();
        char[] result = new char[n];
        char ch;
        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            if (isVowel(ch)) {
                vowels.add(ch);
                result[i] = 'a';
            } else {
                result[i] = ch;
            }
        }
        
        Collections.sort(vowels);
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (result[i] == 'a') {
                result[i] = vowels.get(j);
                j++;
            }
        }
        
        return new String(result);
    }
    
    public boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
               || ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O'|| ch == 'U');
    }
}