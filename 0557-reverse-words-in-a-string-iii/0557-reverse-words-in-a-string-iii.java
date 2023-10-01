class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            sb.append(reverse(words[i]));
            if (i <  words.length - 1) {
                 sb.append(" ");
            }
        }
        
        return sb.toString();
    }
    
    public String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString();
    }
}