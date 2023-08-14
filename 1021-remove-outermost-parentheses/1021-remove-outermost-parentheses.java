class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int counter = 0;
        char ch;
        int lastIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == '(') {
                counter++;
            } else if (ch == ')') {
                counter--;
            }
            if (counter == 0) {
                result.append(s.substring(lastIndex + 1, i));
                lastIndex = i + 1;
            }
            
        }
        return result.toString();
    }
}