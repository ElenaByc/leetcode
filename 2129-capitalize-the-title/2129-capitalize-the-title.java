class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            words[i] = capitalize(words[i]);
        }
        return String.join(" ", words);
    }
    
    public String capitalize(String word) {
        int n = word.length();
        if (n < 3) {
            return word.toLowerCase();
        }
        return Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
    }
}