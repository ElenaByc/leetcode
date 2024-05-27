class Solution {
    public String compressedString(String word) {
        if (word.length() == 1) {
            return "1" + word;
        }
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        char ch = word.charAt(0);
        int i = 1;
        while (i < word.length()) {
            while (cnt < 9 && i < word.length() && word.charAt(i) == ch) {
                cnt++;
                i++;
            }
            sb.append(Integer.toString(cnt));
            sb.append(ch);
            if (i < word.length() - 1) {
                ch = word.charAt(i);
                cnt = 1;
                i++;
            } else if (i == word.length() - 1){
                sb.append(Integer.toString(1));
                sb.append(word.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}