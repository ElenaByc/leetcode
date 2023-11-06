class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        char ch;
        
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (stack.size() > 0) {
                if (ch == stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while (stack.size() > 0) {
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
    }
}